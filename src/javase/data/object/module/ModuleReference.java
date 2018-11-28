package javase.data.object.module;

import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleReader;
import java.net.URI;
import java.util.Objects;

/**
 * @see java.lang.module.ModuleReference
 */
public abstract class ModuleReference extends java.lang.module.ModuleReference
{
    private final ModuleDescriptor descriptor;
    private final URI location;

    protected ModuleReference(ModuleDescriptor descriptor, URI location) {
        super(descriptor,location);
        this.descriptor = Objects.requireNonNull(descriptor);
        this.location = location;
    }

    // public final ModuleDescriptor descriptor() { return descriptor; }
    // public final Optional<URI> location() { return Optional.ofNullable(location); }
    public abstract ModuleReader open() throws IOException;
}
