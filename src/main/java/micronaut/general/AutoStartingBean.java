package micronaut.general;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import micronaut.general.service.MyEntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AutoStartingBean {

	@Inject protected MyEntityService myEntityService;

	public static final Logger logger = LoggerFactory.getLogger(AutoStartingBean.class);

	@EventListener
	public void start(StartupEvent event) {
		logger.debug("Starting...");
	}

}
