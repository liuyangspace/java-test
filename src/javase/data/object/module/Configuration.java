package javase.data.object.module;

import java.lang.module.ModuleFinder;
import java.lang.module.ResolvedModule;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * A configuration that is the result of <a href="package-summary.html#resolution">
 * resolution</a> or resolution with <a href="#service-binding">service binding</a>.
 *
 * @see java.lang.module.Configuration
 */
public /* final */ class Configuration
{
    public java.lang.module.Configuration $this;

    public java.lang.module.Configuration resolve(java.lang.module.ModuleFinder before, ModuleFinder after, Collection<String> roots) { return $this.resolve(before,after,roots); }
    public java.lang.module.Configuration resolveAndBind(ModuleFinder before, ModuleFinder after, Collection<String> roots) { return $this.resolveAndBind(before,after,roots); }
    public List<java.lang.module.Configuration> parents() {
        return $this.parents();
    }
    public Set<ResolvedModule> modules() {
        return $this.modules();
    }
    public Optional<ResolvedModule> findModule(String name) {return $this.findModule(name);}
    public String toString() {return $this.toString();}

    public static java.lang.module.Configuration empty() {
        return java.lang.module.Configuration.empty();
    }
    public static java.lang.module.Configuration resolve(ModuleFinder before, List<java.lang.module.Configuration> parents, ModuleFinder after, Collection<String> roots)
                    { return java.lang.module.Configuration.resolve(before,parents,after,roots); }
    public static java.lang.module.Configuration resolveAndBind(ModuleFinder before, List<java.lang.module.Configuration> parents, ModuleFinder after, Collection<String> roots)
                    { return java.lang.module.Configuration.resolveAndBind(before,parents,after,roots); }

}
