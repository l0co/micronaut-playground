package micronaut.general;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.validation.Validated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton @Validated
public class AutoStartingBean {

	public static final Logger logger = LoggerFactory.getLogger(AutoStartingBean.class);

	@EventListener
	public void start(StartupEvent event) {
		logger.debug("Starting...");
	}

}
