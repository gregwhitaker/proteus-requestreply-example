/**
 * Copyright 2018 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package proteus.example.service.helloworld;

import io.netty.buffer.ByteBuf;
import reactor.core.publisher.Mono;

public class DefaultHelloWorldService implements HelloWorldService {

    @Override
    public Mono<HelloResponse> sayHello(HelloRequest message, ByteBuf metadata) {
        return null;
    }
}