package javase.data.object.clazz.reflect.member.executable;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * {@code Constructor} provides information about, and access to, a single
 * constructor for a class.
 *
 * @see java.lang.reflect.Constructor
 * @see Member
 * @see java.lang.Class
 * @see java.lang.Class#getConstructors()
 * @see java.lang.Class#getConstructor(Class[])
 * @see java.lang.Class#getDeclaredConstructors()
 */
public class Constructor<T> {
    java.lang.reflect.Constructor<T> $this;
    // get
    public String getName(){return $this.getName();}
    public int getModifiers(){return $this.getModifiers();}
    public Class<T> getDeclaringClass(){return $this.getDeclaringClass();}
    public String toString(){return $this.toString();}
    public String toGenericString(){return $this.toGenericString();}
    // is
    public boolean isVarArgs(){return $this.isVarArgs();}
    public boolean isSynthetic(){return $this.isSynthetic();}
    // Access
    public void setAccessible(boolean flag) {$this.setAccessible(flag);}
    public T newInstance(Object ... initargs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
        {return $this.newInstance(initargs);}
    // Parameter
    public int getParameterCount() { return $this.getParameterCount(); }
    public Class<?>[] getParameterTypes() {return $this.getParameterTypes();}
    public Type[] getGenericParameterTypes(){return $this.getGenericParameterTypes();}
    // Exception
    public Class<?>[] getExceptionTypes(){return $this.getExceptionTypes();}
    public Type[] getGenericExceptionTypes(){return $this.getGenericExceptionTypes();}
    // 泛型
    public TypeVariable<java.lang.reflect.Constructor<T>>[] getTypeParameters() {return $this.getTypeParameters();}
    //
    public boolean equals(Object obj) {return $this.equals(obj);}
    public int hashCode(){return $this.hashCode();}
    //Annotation
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { return $this.getAnnotation(annotationClass); }
    public Annotation[] getDeclaredAnnotations()  { return $this.getDeclaredAnnotations(); }
    public Annotation[][] getParameterAnnotations() { return $this.getParameterAnnotations(); }
    public AnnotatedType getAnnotatedReturnType() { return $this.getAnnotatedReturnType(); }
    public AnnotatedType getAnnotatedReceiverType(){return $this.getAnnotatedReceiverType();}
}
