package micronaut.general;

import io.micronaut.runtime.event.annotation.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.inject.Singleton;

/**
 * @author Lukasz Frankowski
 */
@Singleton
public class Bean {

	public static final Logger logger = LoggerFactory.getLogger(Bean.class);

	public Bean() {
		logger.debug("Creating bean: {}", this);
	}

	@EventListener
	public void receive(@Nonnull Event event) {
		logger.debug("As: {} receiving event: {}", this, event);
	}
}
