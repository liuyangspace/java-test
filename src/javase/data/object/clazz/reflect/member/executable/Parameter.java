package javase.data.object.clazz.reflect.member.executable;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.Type;

/**
 * Information about method parameters.
 *
 * A {@code Parameter} provides information about method parameters,
 * including its name and modifiers.  It also provides an alternate
 * means of obtaining attributes for the parameter.
 *
 * @see java.lang.reflect.Parameter
 * @see java.lang.reflect.Parameter#getAnnotations
 */
public class Parameter // extends Executable
{
    java.lang.reflect.Parameter $this;
    // Executable method,constructor...
    public Executable getDeclaringExecutable() {return $this.getDeclaringExecutable();}
    //
    public String getName() {return $this.getName();}
    public int getModifiers() {return $this.getModifiers();}
    //
    public Type getParameterizedType() {return $this.getParameterizedType();}
    public Class<?> getType() {return $this.getType();}
    //
    public boolean equals(Object obj) {return $this.equals(obj);}
    public int hashCode(){return $this.hashCode();}
    public boolean isNamePresent(){return $this.isNamePresent();}
    public String toString() {return $this.toString();}
    //
    public boolean isImplicit() {return $this.isImplicit();}
    public boolean isSynthetic(){return $this.isSynthetic();}
    public boolean isVarArgs() {return $this.isVarArgs();}
    //
    public AnnotatedType getAnnotatedType() {return $this.getAnnotatedType();}
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {return $this.getAnnotation(annotationClass);}
    public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) {return $this.getAnnotationsByType(annotationClass);}
    public Annotation[] getDeclaredAnnotations()  { return $this.getDeclaredAnnotations(); }
    public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) {return $this.getDeclaredAnnotation(annotationClass);}
    public <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) {return $this.getDeclaredAnnotationsByType(annotationClass);}
    public Annotation[] getAnnotations(){return $this.getAnnotations();}
}
