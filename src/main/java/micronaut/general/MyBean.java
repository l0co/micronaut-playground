package micronaut.general;

import io.micronaut.transaction.annotation.TransactionalAdvice;

import javax.inject.Singleton;

@TransactionalAdvice @Singleton @Handler(MyEntity.class)
public class MyBean {

	public void a() {

	}

}
