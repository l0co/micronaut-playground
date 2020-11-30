package micronaut.general.test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import micronaut.general.SafeHttpClient;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.inject.Named;

@MicronautTest
public class SafeLowLevelClientTest {

	@Inject
	@Named(SafeLowLevelClientFactory.INTERNAL_SERVICE_CLIENT) protected SafeHttpClient internalServiceClient;

	@Test
	public void testNonExistingInternalServiceClient() {
		internalServiceClient.retrieve("/").blockingSingle();
	}

}
