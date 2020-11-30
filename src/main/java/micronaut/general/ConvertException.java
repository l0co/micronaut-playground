package micronaut.general;

import io.micronaut.aop.Around;
import io.micronaut.context.annotation.Type;

import javax.inject.Singleton;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Around
@Type(ConvertExceptionInterceptor.class)
public @interface ConvertException {

	/**
	 * The converters list, each of the should be accessible as a {@link Singleton} bean in the container.
	 */
	Class<? extends IExceptionConverter>[] value();

}
