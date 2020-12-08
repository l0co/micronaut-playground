package micronaut.general.test;

import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import micronaut.general.IMyBean;
import micronaut.general.MyBean;
import micronaut.general.ReplacingBean;

import javax.inject.Inject;

/**
 * @author Lukasz Frankowski
 */
@MicronautTest
public class Test {

	@Inject protected IMyBean myBean;

	@org.junit.jupiter.api.Test
	public void test() {

	}

	@MockBean(ReplacingBean.class)
	public IMyBean mockMyBean() {
		return new MyBean();
	}

}
