package micronaut.general;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.validation.Validated;

import javax.inject.Named;

@Factory
public class MyBeanFactory {

	@Bean @Named("bean1") @Validated
	public IMyBean bean1() {
		return new MyBean();
	}

	@Bean @Named("bean2") @Validated
	public IMyBean bean2() {
		return new MyBean();
	}

}
