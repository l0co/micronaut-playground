package micronaut.general.test;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.http.client.HttpClientConfiguration;
import io.micronaut.http.client.LoadBalancerResolver;
import io.micronaut.retry.annotation.CircuitBreaker;
import micronaut.general.*;

import javax.inject.Named;

@Factory
public class SafeLowLevelClientFactory {

	public static final String INTERNAL_SERVICE_CLIENT = "lowLevelInternalServiceClient";

	@Bean @Named(INTERNAL_SERVICE_CLIENT)
	@ConvertException(ServiceUnavailableExceptionConverter.class)
	@CircuitBreaker(includes = ServiceUnavailableException.class)
	public SafeHttpClient createInternalServiceClient(LoadBalancerResolver loadBalancerResolver, HttpClientConfiguration configuration) {
		return new DefaultSafeHttpClient(loadBalancerResolver.resolve("safe-non-existing-service").orElseThrow(),
			configuration, "/safe-non-existing-path");
	}


}
