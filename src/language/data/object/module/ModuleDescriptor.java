package language.data.object.module;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

/**
 * A module descriptor.
 *
 * @see java.lang.module.ModuleDescriptor
 */
public class ModuleDescriptor implements Comparable<java.lang.module.ModuleDescriptor>
{
    public static enum Modifier {
        OPEN,// An open module.
        AUTOMATIC,// An automatic module.
        SYNTHETIC,// The module was not explicitly or implicitly declared.
        MANDATED;// The module was implicitly declared.
    }
    /** @see java.lang.module.ModuleDescriptor.Requires */
    public final static class Requires implements Comparable<java.lang.module.ModuleDescriptor.Requires>
    {
        public java.lang.module.ModuleDescriptor.Requires $this;
        public static enum Modifier {
            TRANSITIVE,
            STATIC,
            SYNTHETIC,
            MANDATED;
        }
        // private Requires(Set<Modifier> ms, String mn, Version v, String vs) {}
        // private Requires(Set<Modifier> ms, String mn, Version v, boolean unused) {}
        public Set<java.lang.module.ModuleDescriptor.Requires.Modifier> modifiers() {
            return $this.modifiers();
        }
        public String name() { return $this.name(); }
        public Optional<java.lang.module.ModuleDescriptor.Version> compiledVersion() { return $this.compiledVersion(); }
        public Optional<String> rawCompiledVersion() {return $this.rawCompiledVersion();}
        public int compareTo(java.lang.module.ModuleDescriptor.Requires that) {return $this.compareTo(that);}
        public boolean equals(Object ob) {return $this.equals(ob);}
        public int hashCode() {return $this.hashCode();}
        public String toString() {return $this.toString();}
    }
    /** @see java.lang.module.ModuleDescriptor.Exports */
    public final static class Exports implements Comparable<java.lang.module.ModuleDescriptor.Exports>
    {
        public java.lang.module.ModuleDescriptor.Exports $this;
        public static enum Modifier {
            SYNTHETIC,// he export was not explicitly or implicitly declared in the source of the module declaration.
            MANDATED;// The export was implicitly declared in the source of the module declaration.
        }
        public Set<java.lang.module.ModuleDescriptor.Exports.Modifier> modifiers() {
            return $this.modifiers();
        }
        public boolean isQualified() {
            return $this.isQualified();
        }
        public String source() {
            return $this.source();
        }
        public Set<String> targets() {
            return $this.targets();
        }
        public int compareTo(java.lang.module.ModuleDescriptor.Exports that) {return $this.compareTo(that);}
        public int hashCode() {return $this.hashCode();}
        public String toString() {return $this.toString();}
        public boolean equals(Object ob) {return $this.equals(ob);}
    }
    /** @see java.lang.module.ModuleDescriptor.Opens */
    public final static class Opens implements Comparable<java.lang.module.ModuleDescriptor.Opens>
    {
        public java.lang.module.ModuleDescriptor.Opens $this;
        public static enum Modifier {
            SYNTHETIC,// The open package was not explicitly or implicitly declared in the source of the module declaration.
            MANDATED;// The open package was implicitly declared in the source of the module declaration.
        }
        public Set<java.lang.module.ModuleDescriptor.Opens.Modifier> modifiers() {
            return $this.modifiers();
        }
        public boolean isQualified() {
            return $this.isQualified();
        }
        public String source() {
            return $this.source();
        }
        public Set<String> targets() {
            return $this.targets();
        }
        public int compareTo(java.lang.module.ModuleDescriptor.Opens that) {return $this.compareTo(that);}
        public int hashCode() {return $this.hashCode();}
        public String toString() {return $this.toString();}
        public boolean equals(Object ob) {return $this.equals(ob);}
    }
    /** @see java.lang.module.ModuleDescriptor.Provides */
    public final static class Provides implements Comparable<java.lang.module.ModuleDescriptor.Provides>
    {
        public java.lang.module.ModuleDescriptor.Provides $this;
        public String service() { return $this.service(); }
        public List<String> providers() { return $this.providers(); }
        public int compareTo(java.lang.module.ModuleDescriptor.Provides that) {return $this.compareTo(that);}
        public int hashCode() {return $this.hashCode();}
        public String toString() {return $this.toString();}
        public boolean equals(Object ob) {return $this.equals(ob);}
    }
    /** @see java.lang.module.ModuleDescriptor.Version */
    public final static class Version implements Comparable<java.lang.module.ModuleDescriptor.Version>
    {
        public java.lang.module.ModuleDescriptor.Version $this;
        public static java.lang.module.ModuleDescriptor.Version parse(String v) { return java.lang.module.ModuleDescriptor.Version.parse(v); }
        public int compareTo(java.lang.module.ModuleDescriptor.Version that) {return $this.compareTo(that);}
        public int hashCode() {return $this.hashCode();}
        public String toString() {return $this.toString();}
        public boolean equals(Object ob) {return $this.equals(ob);}
    }
    /** @see java.lang.module.ModuleDescriptor.Builder */
    public static final class Builder
    {
        public java.lang.module.ModuleDescriptor.Builder $this;
        public java.lang.module.ModuleDescriptor.Builder requires(java.lang.module.ModuleDescriptor.Requires req) {return $this.requires(req);}
        public java.lang.module.ModuleDescriptor.Builder requires(Set<java.lang.module.ModuleDescriptor.Requires.Modifier> ms, String mn,
                        java.lang.module.ModuleDescriptor.Version compiledVersion) {return $this.requires(ms,mn,compiledVersion);}
        public java.lang.module.ModuleDescriptor.Builder requires(Set<java.lang.module.ModuleDescriptor.Requires.Modifier> ms, String mn) {return $this.requires(ms,mn);}
        public java.lang.module.ModuleDescriptor.Builder requires(String mn){return $this.requires(mn);}
        public java.lang.module.ModuleDescriptor.Builder exports(java.lang.module.ModuleDescriptor.Exports e) {return $this.exports(e);}
        public java.lang.module.ModuleDescriptor.Builder exports(Set<java.lang.module.ModuleDescriptor.Exports.Modifier> ms, String pn, Set<String> targets)
                        { return $this.exports(ms,pn,targets); }
        public java.lang.module.ModuleDescriptor.Builder exports(Set<java.lang.module.ModuleDescriptor.Exports.Modifier> ms, String pn) {return $this.exports(ms,pn);}
        public java.lang.module.ModuleDescriptor.Builder exports(String pn, Set<String> targets){return $this.exports(pn,targets);}
        public java.lang.module.ModuleDescriptor.Builder exports(String pn) { return exports(Collections.emptySet(), pn); }
        public java.lang.module.ModuleDescriptor.Builder opens(java.lang.module.ModuleDescriptor.Opens obj) { return $this.opens(obj); }
        public java.lang.module.ModuleDescriptor.Builder opens(Set<java.lang.module.ModuleDescriptor.Opens.Modifier> ms, String pn, Set<String> targets)
                        { return $this.opens(ms,pn,targets); }
        public java.lang.module.ModuleDescriptor.Builder opens(Set<java.lang.module.ModuleDescriptor.Opens.Modifier> ms, String pn) {return $this.opens(ms,pn);}
        public java.lang.module.ModuleDescriptor.Builder opens(String pn, Set<String> targets){return $this.opens(pn,targets);}
        public java.lang.module.ModuleDescriptor.Builder opens(String pn) {
            return opens(Collections.emptySet(), pn);
        }
        public java.lang.module.ModuleDescriptor.Builder uses(String service) {return $this.uses(service);}
        public java.lang.module.ModuleDescriptor.Builder provides(java.lang.module.ModuleDescriptor.Provides p) {return $this.provides(p);}
        public java.lang.module.ModuleDescriptor.Builder provides(String service, List<String> providers) { return $this.provides(service,providers); }
        public java.lang.module.ModuleDescriptor.Builder packages(Set<String> pns) {return $this.packages(pns);}
        public java.lang.module.ModuleDescriptor.Builder version(java.lang.module.ModuleDescriptor.Version v) {return $this.version(v);}
        public java.lang.module.ModuleDescriptor.Builder version(String vs) { return $this.version(vs); }
        public java.lang.module.ModuleDescriptor.Builder mainClass(String mc) {return $this.mainClass(mc);}
        public java.lang.module.ModuleDescriptor build() {return $this.build();}
    }
    //
    public java.lang.module.ModuleDescriptor $this;
    public String name() {
        return $this.name();
    }
    public Set<java.lang.module.ModuleDescriptor.Modifier> modifiers() {
        return $this.modifiers();
    }
    public boolean isOpen() {
        return $this.isOpen();
    }
    public boolean isAutomatic() {
        return $this.isAutomatic();
    }
    public Set<java.lang.module.ModuleDescriptor.Requires> requires() {
        return $this.requires();
    }
    public Set<java.lang.module.ModuleDescriptor.Exports> exports() {
        return $this.exports();
    }
    public Set<java.lang.module.ModuleDescriptor.Opens> opens() { return $this.opens(); }
    public Set<String> uses() {
        return $this.uses();
    }
    public Set<java.lang.module.ModuleDescriptor.Provides> provides() {
        return $this.provides();
    }
    public Optional<java.lang.module.ModuleDescriptor.Version> version() {
        return $this.version();
    }
    public Optional<String> rawVersion() { return $this.rawVersion(); }
    public String toNameAndVersion() {return $this.toNameAndVersion();}
    public Optional<String> mainClass() {
        return $this.mainClass();
    }
    public Set<String> packages() {
        return $this.packages();
    }
    public int compareTo(java.lang.module.ModuleDescriptor that) {return $this.compareTo(that);}
    public boolean equals(Object ob) {return $this.equals(ob);}
    public int hashCode() {return $this.hashCode();}
    public String toString() {return $this.toString();}

    public static java.lang.module.ModuleDescriptor.Builder newModule(String name, Set<java.lang.module.ModuleDescriptor.Modifier> ms)
                    {return java.lang.module.ModuleDescriptor.newModule(name,ms);}
    public static java.lang.module.ModuleDescriptor.Builder newModule(String name) {return java.lang.module.ModuleDescriptor.newModule(name);}
    public static java.lang.module.ModuleDescriptor.Builder newOpenModule(String name) {return java.lang.module.ModuleDescriptor.newOpenModule(name);}
    public static java.lang.module.ModuleDescriptor.Builder newAutomaticModule(String name) {return java.lang.module.ModuleDescriptor.newAutomaticModule(name);}
    public static java.lang.module.ModuleDescriptor read(InputStream in, Supplier<Set<String>> packageFinder) throws IOException
                    { return java.lang.module.ModuleDescriptor.read(in,packageFinder); }
    public static java.lang.module.ModuleDescriptor read(InputStream in) throws IOException {return java.lang.module.ModuleDescriptor.read(in);}
    public static java.lang.module.ModuleDescriptor read(ByteBuffer bb, Supplier<Set<String>> packageFinder)
                    {return java.lang.module.ModuleDescriptor.read(bb,packageFinder);}
    public static java.lang.module.ModuleDescriptor read(ByteBuffer bb) {return java.lang.module.ModuleDescriptor.read(bb);}
    /** @see java.lang.module.ModuleDescriptor#modsValue */
}
