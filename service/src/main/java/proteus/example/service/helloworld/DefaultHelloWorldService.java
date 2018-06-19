package proteus.example.service.helloworld;

import io.netty.buffer.ByteBuf;
import reactor.core.publisher.Mono;

public class DefaultHelloWorldService implements HelloWorldService {

    @Override
    public Mono<HelloResponse> sayHello(HelloRequest message, ByteBuf metadata) {
        return null;
    }
}
