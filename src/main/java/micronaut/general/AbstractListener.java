package micronaut.general;

import io.micronaut.context.event.BeanCreatedEvent;
import io.micronaut.context.event.BeanCreatedEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * @author Lukasz Frankowski
 */
public abstract class AbstractListener implements BeanCreatedEventListener<AutoStartingBean> {

	public static final Logger logger = LoggerFactory.getLogger(AbstractListener.class);

	@Inject protected SomeBean someBean;

	@Override
	public AutoStartingBean onCreated(BeanCreatedEvent<AutoStartingBean> event) {
		logger.debug("Listener called with: {}", event.getBean());

		return event.getBean();
	}
}
