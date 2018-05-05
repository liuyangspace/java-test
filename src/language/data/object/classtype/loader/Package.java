package language.data.object.classtype.loader;

import java.lang.ClassLoader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.net.URL;

/**
 * Represents metadata about a run-time package associated with a class loader.
 * Metadata includes annotations, versioning, and sealing.
 *
 * 静态导包: import static
 *      导入类内的静态成员（属性或方法），导入后可直接引用（不须标明类）
 *
 * @see java.lang.NamedPackage
 * @see java.lang.Package
 * @see ClassLoader#definePackage(String, String, String, String, String, String, String, URL)
 */
public class Package // extends java.lang.Package implements java.lang.reflect.AnnotatedElement
{
    public java.lang.Package $this;

    public String getName() { return $this.getName(); }
    public String getSpecificationTitle() { return $this.getSpecificationTitle(); }
    public String getSpecificationVersion() { return $this.getSpecificationVersion(); }
    public String getSpecificationVendor() { return $this.getSpecificationVendor(); }
    public String getImplementationTitle() { return $this.getImplementationTitle(); }
    public String getImplementationVersion() { return $this.getImplementationVersion(); }
    public String getImplementationVendor() { return $this.getImplementationVendor(); }
    public boolean isSealed() { return $this.isSealed(); }
    public boolean isSealed(URL url) { return $this.isSealed(url); }
    public boolean isCompatibleWith(String desired) { return $this.isCompatibleWith(desired); }


    public static java.lang.Package getPackage(String name) {return java.lang.Package.getPackage(name);}
    public static java.lang.Package[] getPackages() {return java.lang.Package.getPackages();}

    public int hashCode(){ return $this.hashCode(); }
    public String toString() {return $this.toString();}
    public <A extends Annotation> A getAnnotation(Class<A> annotationClass) { return $this.getAnnotation(annotationClass); }
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { return $this.isAnnotationPresent(annotationClass); }
    public  <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass) { return $this.getAnnotationsByType(annotationClass); }
    public Annotation[] getAnnotations() { return $this.getAnnotations(); }
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) { return $this.getDeclaredAnnotation(annotationClass); }
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> annotationClass) { return $this.getDeclaredAnnotationsByType(annotationClass); }
    public Annotation[] getDeclaredAnnotations()  {
        return $this.getDeclaredAnnotations();
    }
}
