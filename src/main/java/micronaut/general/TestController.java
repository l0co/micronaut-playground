package micronaut.general;

import io.micronaut.core.async.publisher.Publishers;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

import java.util.concurrent.CompletableFuture;

@Controller("/")
public class TestController {

	@Get(value = "ok", produces = MediaType.TEXT_PLAIN)
	public Flowable<String> standardFlow() {
		CompletableFuture<String> cf = new CompletableFuture<>();
		cf.complete("hello world");

		return Flowable.fromPublisher(Publishers.fromCompletableFuture(() -> cf));
	}

	@Get(value = "error", produces = MediaType.TEXT_PLAIN)
	public Flowable<String> exceptionFlow() {
		return Flowable.fromPublisher(Publishers.fromCompletableFuture(() -> {
			throw new IllegalArgumentException();
		}));
	}

}
