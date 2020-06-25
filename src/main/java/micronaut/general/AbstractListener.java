package micronaut.general;

import io.micronaut.context.event.BeanCreatedEvent;
import io.micronaut.context.event.BeanCreatedEventListener;
import io.micronaut.validation.Validated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Lukasz Frankowski
 */
@Validated
public abstract class AbstractListener implements BeanCreatedEventListener<AutoStartingBean> {

	public static final Logger logger = LoggerFactory.getLogger(AbstractListener.class);

	@Override
	public AutoStartingBean onCreated(BeanCreatedEvent<AutoStartingBean> event) {
		logger.debug("Listener called with: {}", event.getBean());

		return event.getBean();
	}
}
