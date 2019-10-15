package micronaut.general;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AutoStartingBean {

	public static final Logger logger = LoggerFactory.getLogger(AutoStartingBean.class);

	@Inject protected TransactionalBean transactionalBean;

	@PostConstruct
	public void lockHikari() {
		logger.debug("Post-construct starts");
		for (int i=0; i<20; i++)
			transactionalBean.doSomethingTransactionally();
		logger.debug("Post-construct finishes");
	}

	@EventListener
	public void start(StartupEvent event) {
		logger.debug("Starting...");
	}

}
