package language.data.object.module;

import java.lang.Module;
import java.lang.module.Configuration;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

/**
 * A layer of modules in the Java virtual machine.
 *
 * * <h3> Example usage: </h3>
 *
 * <p> This example creates a configuration by resolving a module named
 * "{@code myapp}" with the configuration for the boot layer as the parent. It
 * then creates a new layer with the modules in this configuration. All modules
 * are defined to the same class loader. </p>
 *
 * <pre>{@code
 *     ModuleFinder finder = ModuleFinder.of(dir1, dir2, dir3);
 *
 *     ModuleLayer parent = ModuleLayer.boot();
 *
 *     Configuration cf = parent.configuration().resolve(finder, ModuleFinder.of(), Set.of("myapp"));
 *
 *     ClassLoader scl = ClassLoader.getSystemClassLoader();
 *
 *     ModuleLayer layer = parent.defineModulesWithOneLoader(cf, scl);
 *
 *     Class<?> c = layer.findLoader("myapp").loadClass("app.Main");
 * }</pre>
 *
 * @since 9
 *
 * @see java.lang.ModuleLayer
 */
public class ModuleLayer // extends java.lang.ModuleLayer
{
    public java.lang.ModuleLayer $this;
    /** @see java.lang.ModuleLayer.Controller */
    public static final class Controller {
        public java.lang.ModuleLayer.Controller $this;
        public java.lang.ModuleLayer.Controller addReads(java.lang.Module source, Module target) {return $this.addReads(source,target);}
        public java.lang.ModuleLayer.Controller addExports(Module source, String pn, Module target) {return $this.addExports(source,pn,target);}
        public java.lang.ModuleLayer.Controller addOpens(Module source, String pn, Module target) {return $this.addExports(source,pn,target);}
    }

    public java.lang.ModuleLayer defineModulesWithOneLoader(Configuration cf, ClassLoader parentLoader) { return $this.defineModulesWithOneLoader(cf,parentLoader); }
    public java.lang.ModuleLayer defineModulesWithManyLoaders(Configuration cf, ClassLoader parentLoader) {return $this.defineModulesWithManyLoaders(cf,parentLoader);}
    public java.lang.ModuleLayer defineModules(Configuration cf, Function<String, ClassLoader> clf) {return $this.defineModules(cf,clf);}
    public Configuration configuration() { return $this.configuration(); }
    public List<java.lang.ModuleLayer> parents() { return $this.parents(); }
    public Set<Module> modules() { return $this.modules(); }
    public Optional<Module> findModule(String name) { return $this.findModule(name); }
    public ClassLoader findLoader(String name) { return $this.findLoader(name); }
    public String toString() {return $this.toString();}

    public static java.lang.ModuleLayer empty() {
        return java.lang.ModuleLayer.empty();
    }
    public static java.lang.ModuleLayer boot() {
        return java.lang.ModuleLayer.boot();
    }
    public static java.lang.ModuleLayer.Controller defineModulesWithOneLoader(Configuration cf, List<java.lang.ModuleLayer> parentLayers, ClassLoader parentLoader)
                    { return java.lang.ModuleLayer.defineModulesWithOneLoader(cf,parentLayers,parentLoader); }
    public static java.lang.ModuleLayer.Controller defineModules(Configuration cf, List<java.lang.ModuleLayer> parentLayers, Function<String, ClassLoader> clf)
                    { return java.lang.ModuleLayer.defineModules(cf,parentLayers,clf); }
}
