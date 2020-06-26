package micronaut.general;

import io.micronaut.context.BeanContext;
import io.micronaut.context.event.ApplicationEventPublisher;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * @author Lukasz Frankowski
 */
@MicronautTest
public class Test1 {

	public static final Logger logger = LoggerFactory.getLogger(Test1.class);

	@Inject protected Bean bean;
	@Inject protected ApplicationEventPublisher eventPublisher;
	@Inject protected BeanContext beanContext;

	@Test
	public void test() {
		eventPublisher.publishEvent(new Event());
		logger.debug("Number of Beans: {}", beanContext.getBeansOfType(Bean.class).size());
	}

}
