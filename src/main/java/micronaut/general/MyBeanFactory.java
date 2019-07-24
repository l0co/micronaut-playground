package micronaut.general;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;

import javax.inject.Named;

@Factory
public class MyBeanFactory {

	@Bean @Named("bean1")
	public IMyBean bean1() {
		return new MyBean();
	}

	@Bean @Named("bean2")
	public IMyBean bean2() {
		return new MyBean();
	}

}
