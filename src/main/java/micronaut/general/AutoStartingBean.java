package micronaut.general;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.core.beans.BeanIntrospection;
import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.validation.Validated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import javax.validation.Constraint;

@Singleton @Validated
public class AutoStartingBean {

	public static final Logger logger = LoggerFactory.getLogger(AutoStartingBean.class);

	@EventListener
	public void start(StartupEvent event) {
		logger.debug("Starting...");
		logger.debug("Indexed properties of SuperClass: {}", BeanIntrospection.getIntrospection(SuperClass.class)
			.getIndexedProperties(Constraint.class).size());
		logger.debug("Indexed properties of SubClass: {}", BeanIntrospection.getIntrospection(SubClass.class)
			.getIndexedProperties(Constraint.class).size());
		logger.debug("Indexed properties of SubClassWithInterface: {}", BeanIntrospection.getIntrospection(SubClassWithInterface.class)
			.getIndexedProperties(Constraint.class).size());
	}

}
