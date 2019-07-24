package micronaut.general;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class AutoStartingBean {

	public static final Logger logger = LoggerFactory.getLogger(AutoStartingBean.class);

	@Inject @Named("bean1") IMyBean myBean1;
	@Inject @Named("bean2") IMyBean myBean2;

	@EventListener
	public void start(StartupEvent event) {
		logger.debug("Starting...");
	}

}
