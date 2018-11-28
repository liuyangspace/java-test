package javase.data.object.module;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Provides access to the content of a module.
 *
 * @see java.lang.module.ModuleReader
 */
public interface ModuleReader extends Closeable
{
    Optional<URI> find(String name) throws IOException;

    default Optional<InputStream> open(String name) throws IOException {
        Optional<URI> ouri = find(name);
        if (ouri.isPresent()) {
            return Optional.of(ouri.get().toURL().openStream());
        } else {
            return Optional.empty();
        }
    }

    default Optional<ByteBuffer> read(String name) throws IOException {
        Optional<InputStream> oin = open(name);
        if (oin.isPresent()) {
            try (InputStream in = oin.get()) {
                return Optional.of(ByteBuffer.wrap(in.readAllBytes()));
            }
        } else {
            return Optional.empty();
        }
    }

    default void release(ByteBuffer bb) {
        Objects.requireNonNull(bb);
    }
    Stream<String> list() throws IOException;
    void close() throws IOException;
}
