package micronaut.general;

import io.micronaut.aop.InterceptPhase;
import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;
import io.micronaut.context.BeanLocator;
import io.micronaut.core.async.publisher.Publishers;
import io.micronaut.core.convert.ConversionService;
import io.micronaut.core.order.Ordered;
import io.micronaut.core.reflect.exception.InvocationException;
import io.reactivex.Flowable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ConvertExceptionInterceptor implements MethodInterceptor<Object, Object>, Ordered {

	public static final Logger logger = LoggerFactory.getLogger(ConvertExceptionInterceptor.class);

	@Inject
	protected BeanLocator beanLocator;

	@SuppressWarnings("unchecked")
	@Override
	public Object intercept(MethodInvocationContext<Object, Object> context) {
		Class<? extends IExceptionConverter>[] converterClasses = context
			.findAnnotation(ConvertException.class).orElseThrow()
			.getValue(Class[].class).orElseThrow();

		try {

			Object res = context.proceed();

			if (Publishers.isConvertibleToPublisher(context.getReturnType().getType())) {
				Flowable<?> observable = ConversionService.SHARED.convert(res, Flowable.class)
					.orElseThrow(() -> new IllegalStateException("Unconvertible Reactive type: " + res));
				return observable.onErrorResumeNext(ex -> {
					try {
						support(ex, converterClasses);
						return Flowable.error(ex);
					} catch (Exception e) {
						return Flowable.error(e);
					}
				});
			}

			return res;

		} catch (Throwable t) {

			support(t, converterClasses);

			throw new RuntimeException(t);
		}
	}

	protected void support(Throwable t, Class<? extends IExceptionConverter>[] converterClasses) {
		for (Class<? extends IExceptionConverter> converterClass: converterClasses) {
			IExceptionConverter converter = beanLocator.findBean(converterClass).orElseThrow();
			try {
				converter.convert(t);
			} catch (Throwable t1) {
				logger.debug("Converting: {} to: {} using: {}", t.getClass().getSimpleName(), t1.getClass().getSimpleName(),
					converter.getClass().getSimpleName());
				t = t1;
			}
		}

		logger.trace("Rethrowing: {} / {}", t.getClass().getSimpleName(), t.getMessage());

		if (t instanceof RuntimeException)
			throw (RuntimeException) t;

		throw new InvocationException("Intercepted exception thrown", t);
	}

	@Override
	public int getOrder() {
		return InterceptPhase.RETRY.getPosition() + 5; // this one needs to go after DefaultRetryInterceptor which goes on InterceptPhase.RETRY
	}

}
