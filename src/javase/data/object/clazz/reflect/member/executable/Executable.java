package javase.data.object.clazz.reflect.member.executable;

// import sun.reflect.generics.repository.ConstructorRepository;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * A shared superclass for the common functionality of {@link Method}
 * and {@link Constructor}.
 *
 * @see java.lang.reflect.Executable
 */
public abstract class Executable // extends java.lang.reflect.Executable
{
    java.lang.reflect.Executable $this;

    public abstract Class<?> getDeclaringClass();
    public abstract String getName();
    public abstract String toGenericString();
    public abstract int getModifiers();
    // Parameter
    public abstract TypeVariable<?>[] getTypeParameters();
    public abstract Class<?>[] getParameterTypes();
    public int getParameterCount() { throw new AbstractMethodError(); }
    public Type[] getGenericParameterTypes() {return $this.getGenericParameterTypes();}
    public Parameter[] getParameters() {return $this.getParameters();}
    public abstract Annotation[][] getParameterAnnotations();
    // Exception
    public abstract Class<?>[] getExceptionTypes();
    public Type[] getGenericExceptionTypes() {return $this.getGenericExceptionTypes();}
    //
    public boolean isVarArgs()  { return $this.isVarArgs(); }
    public boolean isSynthetic() { return $this.isVarArgs(); }
    // Annotation
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {return $this.getAnnotation(annotationClass);}
    public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) {return $this.getAnnotationsByType(annotationClass);}
    public Annotation[] getDeclaredAnnotations()  { return $this.getDeclaredAnnotations(); }
    public abstract AnnotatedType getAnnotatedReturnType();
    public AnnotatedType getAnnotatedReceiverType() {return $this.getAnnotatedReceiverType();}
    public AnnotatedType[] getAnnotatedParameterTypes() {return $this.getAnnotatedParameterTypes();}
    public AnnotatedType[] getAnnotatedExceptionTypes() {return $this.getAnnotatedExceptionTypes();}

}
