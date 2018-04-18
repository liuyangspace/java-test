package language.data.object.module;

import java.lang.module.ModuleReference;
import java.nio.file.Path;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * A finder of modules.A {@code ModuleFinder} is used to find modules during
 * <a href="package-summary.html#resolution">resolution</a> or
 * <a href="Configuration.html#service-binding">service binding</a>.
 *
 * <p> Example usage: </p>
 * <pre>{@code
 *     Path dir1, dir2, dir3;
 *
 *     ModuleFinder finder = ModuleFinder.of(dir1, dir2, dir3);
 *
 *     Optional<ModuleReference> omref = finder.find("jdk.foo");
 *     omref.ifPresent(mref -> ... );
 *
 * }</pre>
 *
 * @see java.lang.module.ModuleFinder
 */
public interface ModuleFinder
{
    Optional<ModuleReference> find(String name);// Finds a reference to a module of a given name.
    Set<ModuleReference> findAll();// Returns the set of all module references that this finder can locate.
    static java.lang.module.ModuleFinder ofSystem() { return java.lang.module.ModuleFinder.ofSystem(); }
    static java.lang.module.ModuleFinder of(Path... entries) { return java.lang.module.ModuleFinder.of(entries); }
    static java.lang.module.ModuleFinder compose(java.lang.module.ModuleFinder... finders) { return java.lang.module.ModuleFinder.compose(finders); }
}
