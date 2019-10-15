package micronaut.general;

import io.micronaut.spring.tx.annotation.Transactional;

import javax.inject.Singleton;

@Transactional @Singleton
public class TransactionalBean {

	public void doSomethingTransactionally() {
	}

}
