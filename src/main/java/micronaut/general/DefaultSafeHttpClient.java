package micronaut.general;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import io.micronaut.core.annotation.AnnotationMetadataResolver;
import io.micronaut.core.io.ResourceResolver;
import io.micronaut.http.HttpVersion;
import io.micronaut.http.bind.RequestBinderRegistry;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.DefaultHttpClientConfiguration;
import io.micronaut.http.client.HttpClientConfiguration;
import io.micronaut.http.client.LoadBalancer;
import io.micronaut.http.client.filter.ClientFilterResolutionContext;
import io.micronaut.http.client.netty.DefaultHttpClient;
import io.micronaut.http.client.netty.ssl.NettyClientSslBuilder;
import io.micronaut.http.codec.MediaTypeCodecRegistry;
import io.micronaut.http.filter.HttpClientFilter;
import io.micronaut.http.filter.HttpClientFilterResolver;
import io.micronaut.http.filter.HttpFilterResolver.FilterEntry;
import io.micronaut.jackson.ObjectMapperFactory;
import io.micronaut.jackson.codec.JsonMediaTypeCodec;
import io.micronaut.jackson.codec.JsonStreamMediaTypeCodec;
import io.micronaut.runtime.ApplicationConfiguration;
import io.micronaut.websocket.context.WebSocketBeanRegistry;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.MultithreadEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.concurrent.DefaultThreadFactory;

import java.net.URL;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class DefaultSafeHttpClient extends DefaultHttpClient implements SafeHttpClient {

	public DefaultSafeHttpClient(LoadBalancer loadBalancer, HttpClientConfiguration configuration, @Nullable String contextPath,
								 @Nullable ThreadFactory threadFactory, NettyClientSslBuilder nettyClientSslBuilder,
								 MediaTypeCodecRegistry codecRegistry, @Nullable AnnotationMetadataResolver annotationMetadataResolver,
								 HttpClientFilter... filters) {
		super(loadBalancer, configuration, contextPath, threadFactory, nettyClientSslBuilder, codecRegistry, annotationMetadataResolver, filters);
	}

	public DefaultSafeHttpClient(@Nullable LoadBalancer loadBalancer, @Nullable HttpVersion httpVersion, @NonNull HttpClientConfiguration configuration, @Nullable String contextPath, @NonNull HttpClientFilterResolver<ClientFilterResolutionContext> filterResolver, List<FilterEntry<HttpClientFilter>> clientFilterEntries, @Nullable ThreadFactory threadFactory, @NonNull NettyClientSslBuilder nettyClientSslBuilder, @NonNull MediaTypeCodecRegistry codecRegistry, @NonNull WebSocketBeanRegistry webSocketBeanRegistry, @NonNull RequestBinderRegistry requestBinderRegistry, @Nullable EventLoopGroup eventLoopGroup, @NonNull Class<? extends SocketChannel> socketChannelClass) {
		super(loadBalancer, httpVersion, configuration, contextPath, filterResolver, clientFilterEntries, threadFactory, nettyClientSslBuilder, codecRegistry, webSocketBeanRegistry, requestBinderRegistry, eventLoopGroup, socketChannelClass);
	}

	public DefaultSafeHttpClient(LoadBalancer loadBalancer, HttpClientConfiguration configuration, @Nullable String contextPath) {
		this(loadBalancer, configuration, contextPath, new DefaultThreadFactory(MultithreadEventLoopGroup.class),
			new NettyClientSslBuilder(new ResourceResolver()), createDefaultMediaTypeRegistry(), AnnotationMetadataResolver.DEFAULT);
	}

	public DefaultSafeHttpClient(URL url) {
		this(url, new DefaultHttpClientConfiguration());
	}

	public DefaultSafeHttpClient() {
	}

	public DefaultSafeHttpClient(URL url, HttpClientConfiguration configuration) {
		this(url, configuration, null);
	}

	public DefaultSafeHttpClient(URL url, HttpClientConfiguration configuration, String contextPath) {
		this(
			LoadBalancer.fixed(url), configuration, contextPath,
			new DefaultThreadFactory(MultithreadEventLoopGroup.class),
			new NettyClientSslBuilder(new ResourceResolver()), createDefaultMediaTypeRegistry(), AnnotationMetadataResolver.DEFAULT);
	}

	public DefaultSafeHttpClient(@Nullable LoadBalancer loadBalancer, HttpClientConfiguration configuration) {
		super(loadBalancer, configuration);
	}

	@Override
	public BlockingHttpClient toBlocking() {
		throw new IllegalStateException("Safe client can't be used in blocking way");
	}

	public static MediaTypeCodecRegistry createDefaultMediaTypeRegistry() {
		ObjectMapper objectMapper = new ObjectMapperFactory().objectMapper(null, null);
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		return MediaTypeCodecRegistry.of(
			new JsonMediaTypeCodec(objectMapper, applicationConfiguration, null), new JsonStreamMediaTypeCodec(objectMapper, applicationConfiguration, null)
		);
	}

}
