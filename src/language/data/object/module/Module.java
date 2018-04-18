package language.data.object.module;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ModuleLayer;
import java.lang.annotation.Annotation;
import java.lang.module.ModuleDescriptor;
import java.util.Set;

/**
 * Represents a run-time module, either {@link #isNamed() named} or unnamed.
 *
 * @see java.lang.Module
 */
public final class Module // extends java.lang.Module implements AnnotatedElement
{
    public java.lang.Module $this;

    public boolean isNamed() {
        return $this.isNamed();
    }
    public String getName() {
        return $this.getName();
    }
    public ClassLoader getClassLoader() {return $this.getClassLoader();}
    public ModuleDescriptor getDescriptor() {
        return $this.getDescriptor();
    }
    public ModuleLayer getLayer() {return $this.getLayer();}
    public boolean canRead(java.lang.Module other) {return $this.canRead(other);}
    public java.lang.Module addReads(java.lang.Module other) {return $this.addReads(other);}
    public boolean isExported(String pn, java.lang.Module other) {return $this.isExported(pn,other);}
    public boolean isExported(String pn) {return $this.isOpen(pn);}
    public java.lang.Module addExports(String pn, java.lang.Module other) {return $this.addExports(pn,other);}
    public boolean isOpen(String pn, java.lang.Module other) {return $this.isOpen(pn,other);}
    public boolean isOpen(String pn) {return $this.isOpen(pn);}
    public java.lang.Module addOpens(String pn, java.lang.Module other) {return $this.addOpens(pn,other);}
    public java.lang.Module addUses(Class<?> service) {return $this.addUses(service);}
    public boolean canUse(Class<?> service) {return $this.canUse(service);}
    public Set<String> getPackages() {return $this.getPackages();}
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { return $this.getAnnotation(annotationClass); }
    public Annotation[] getAnnotations() {
        return $this.getAnnotations();
    }
    public Annotation[] getDeclaredAnnotations() {
        return $this.getDeclaredAnnotations();
    }
    public InputStream getResourceAsStream(String name) throws IOException {return $this.getResourceAsStream(name);}
    public String toString() {return $this.toString();}

}
