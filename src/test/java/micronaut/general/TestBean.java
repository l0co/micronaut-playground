package micronaut.general;

import io.micronaut.context.annotation.Replaces;

import javax.inject.Singleton;

/**
 * @author Lukasz Frankowski
 */
@Singleton @Replaces(Bean.class)
public class TestBean extends Bean {

}
