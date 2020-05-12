package micronaut.general;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.transaction.annotation.TransactionalAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton @TransactionalAdvice
public class AutoStartingBean {

	public static final Logger logger = LoggerFactory.getLogger(AutoStartingBean.class);

	@PersistenceContext protected EntityManager entityManager;

	@EventListener
	public void start(StartupEvent event) {
		logger.debug("Starting...");
	}

}
