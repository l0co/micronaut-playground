package micronaut.general;

import io.micronaut.discovery.exceptions.NoAvailableServiceException;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.exceptions.HttpClientException;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.http.client.exceptions.ReadTimeoutException;

import javax.annotation.Nonnull;
import javax.inject.Singleton;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Singleton
public class ServiceUnavailableExceptionConverter implements IExceptionConverter<ServiceUnavailableException> {

	public static final Set<Integer> SERVICE_UNAVAILABLE_HTTP_CODES = Set.of(
		HttpStatus.UNAUTHORIZED.getCode(),
		HttpStatus.PAYMENT_REQUIRED.getCode(),
		HttpStatus.FORBIDDEN.getCode(),
//		HttpStatus.NOT_FOUND.getCode(), // means the entity is not found https://github.com/micronaut-projects/micronaut-core/issues/1090
		HttpStatus.METHOD_NOT_ALLOWED.getCode(),
		HttpStatus.NOT_ACCEPTABLE.getCode(),
		HttpStatus.PROXY_AUTHENTICATION_REQUIRED.getCode(),
		HttpStatus.REQUEST_TIMEOUT.getCode(),
		HttpStatus.TOO_MANY_REQUESTS.getCode(),
		HttpStatus.NOT_IMPLEMENTED.getCode(),
		HttpStatus.BAD_GATEWAY.getCode(),
		HttpStatus.SERVICE_UNAVAILABLE.getCode(),
		HttpStatus.GATEWAY_TIMEOUT.getCode(),
		HttpStatus.INSUFFICIENT_STORAGE.getCode(),
		HttpStatus.BANDWIDTH_LIMIT_EXCEEDED.getCode(),
		HttpStatus.NETWORK_AUTHENTICATION_REQUIRED.getCode(),
		HttpStatus.CONNECTION_TIMED_OUT.getCode()
	);

	@Override
	public void convert(Throwable t) throws ServiceUnavailableException {

		if (

			unwrapException(t, HttpClientResponseException.class)
				.map(HttpClientResponseException::getStatus)
				.map(status -> SERVICE_UNAVAILABLE_HTTP_CODES.contains(status.getCode()))
				.orElse(false)

			|| unwrapException(t, UnknownHostException.class).isPresent()

			|| unwrapException(t, ReadTimeoutException.class).isPresent()

			|| unwrapException(t, NoAvailableServiceException.class).isPresent()

			|| unwrapException(t, HttpClientException.class).isPresent() // connection rejected

		)

			throw new ServiceUnavailableException();

	}

	@SuppressWarnings("unchecked")
	public static <T extends Throwable> Optional<T> unwrapException(@Nonnull Throwable t, @Nonnull Class<T> clazz) {
		Set<Throwable> visited = new HashSet<>(); // protection against self references in getCause()
		while (t!=null && !visited.contains(t) && !clazz.equals(t.getClass())) {
			visited.add(t);
			t = t.getCause();
		}

		if (t!=null && clazz.equals(t.getClass()))
			return Optional.of((T) t);

		return Optional.empty();
	}


}
