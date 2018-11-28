package javase.data.object.module;

import java.lang.module.Configuration;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleReference;
import java.util.Objects;

/**
 * A module in a graph of <em>resolved modules</em>.
 *
 * @see java.lang.module.ResolvedModule
 */
public /* final */class ResolvedModule
{
    private final java.lang.module.Configuration cf;
    private final java.lang.module.ModuleReference mref;

    ResolvedModule(Configuration cf, ModuleReference mref) { this.cf = Objects.requireNonNull(cf); this.mref = Objects.requireNonNull(mref); }
    public Configuration configuration() {
        return cf;
    }
    public ModuleReference reference() {
        return mref;
    }
    ModuleDescriptor descriptor() {
        return reference().descriptor();
    }
    public String name() {
        return reference().descriptor().name();
    }
    /** @see java.lang.module.ResolvedModule#reads */ // public Set<java.lang.module.ResolvedModule> reads() { return cf.reads(this); }
    public int hashCode() {
        return cf.hashCode() ^ mref.hashCode();
    }
    public String toString() {
        return System.identityHashCode(cf) + "/" + name();
    }
    /** @see java.lang.module.ResolvedModule#equals */ // public boolean equals(Object ob) {}
}
