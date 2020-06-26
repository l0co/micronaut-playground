package micronaut.general;

import io.micronaut.context.annotation.Replaces;

import javax.inject.Singleton;

/**
 * @author Lukasz Frankowski
 */
// TODOLF report as a bug
@Singleton @Replaces(Bean.class)
public class TestBean extends Bean {

}
