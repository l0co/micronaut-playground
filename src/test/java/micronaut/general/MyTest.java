package micronaut.general;

import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.inject.Inject;

/**
 * @author Lukasz Frankowski
 */
@MicronautTest
public class MyTest {

	@Inject protected MyBean myBean;

	@Test
	public void test() {
		Assertions.assertTrue(Mockito.mockingDetails(myBean).isMock());
	}

	@MockBean(MyBean.class)
	protected MyBean myBean() {
		return Mockito.mock(MyBean.class);
	}

}
