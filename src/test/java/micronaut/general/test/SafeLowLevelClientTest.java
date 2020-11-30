package micronaut.general.test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import micronaut.general.SafeHttpClient;
import micronaut.general.ServiceUnavailableException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ExceptionUtils;

import javax.inject.Inject;
import javax.inject.Named;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

@MicronautTest
public class SafeLowLevelClientTest {

	@Inject
	@Named(SafeLowLevelClientFactory.INTERNAL_SERVICE_CLIENT) protected SafeHttpClient internalServiceClient;

	@Test
	public void testNonExistingInternalServiceClient() {
		testCircucitBreakerLowLevelSafeClient(internalServiceClient);
	}

	protected void testCircucitBreakerLowLevelSafeClient(SafeHttpClient client, Duration minDurationWithRetry,
														 Duration maxDurationWithOpenCircutBreaker) {
		Runnable op = () -> Assertions.assertThrows(ServiceUnavailableException.class, () -> client.retrieve("/").blockingSingle());
		assertMinimalDuration(Duration.ofMillis(3000), op); // this is the way to check if retry works on circuit breaker (3 attempts with delay)
		Assertions.assertTimeout(Duration.ofMillis(500), op::run); // the circuit is now closed and this should be immediate
	}

	protected void assertMinimalDuration(Duration duration, Runnable runnable) {
		long timeoutInMillis = duration.toMillis();
		long start = System.currentTimeMillis();
		Throwable ex1 = null;
		try {
			runnable.run();
		} catch (Throwable ex) {
			ex1 = ex;
		} finally {
			long timeElapsed = System.currentTimeMillis() - start;
			if (timeElapsed < timeoutInMillis) {
				fail("Execution exceeded timeout of " + timeoutInMillis
					+ " ms by " + (timeElapsed - timeoutInMillis) + " ms", ex1);
			} else if (ex1 != null)
				ExceptionUtils.throwAsUncheckedException(ex1);
		}
	}

	protected void testCircucitBreakerLowLevelSafeClient(SafeHttpClient client) {
		testCircucitBreakerLowLevelSafeClient(client, Duration.ofMillis(3000), Duration.ofMillis(500));
	}

}
