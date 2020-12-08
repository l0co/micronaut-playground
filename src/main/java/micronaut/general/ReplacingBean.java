package micronaut.general;

import io.micronaut.context.annotation.Replaces;

import javax.inject.Singleton;

/**
 * @author Lukasz Frankowski
 */
@Singleton @Replaces(IMyBean.class)
public class ReplacingBean implements IMyBean {
}
