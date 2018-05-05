package language.data.object.classtype.reflect;

import java.lang.String;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Instances of the class {@code Class} represent classes and
 * interfaces in a running Java application.
 *
 *
 * 获取 Class:
 *      Class,forName(String className)
 *      obj.getClass()
 *      int.class
 * For example:
 *  System.out.println("The class of " + obj + " is " + obj.getClass().getName());
 *  System.out.println("The name of class Foo is: "+Foo.class.getName());
 *
 * @see java.lang.Class
 * @see java.lang.ClassLoader#defineClass(byte[], int, int)
 */

public final class Class<T> /* extends java.lang.Class */ implements java.io.Serializable,GenericDeclaration,Type,AnnotatedElement
{
    java.lang.Class aClass;
    // private Class(){} // 私有构造
    public String toString(){ return aClass.toString(); }
    public String toGenericString() { return aClass.toGenericString(); }
    public static java.lang.Class<?> forName(String className)throws ClassNotFoundException { return java.lang.Class.forName(className);}//根据类名实例化
    public static java.lang.Class<?> forName(String className, boolean initialize, ClassLoader loader) throws ClassNotFoundException {return java.lang.Class.forName(className,initialize,loader);}//根据类名实例化

    /* implements */
    // implements GenericDeclaration
    public TypeVariable<?>[] getTypeParameters() {return new TypeVariable[0];}
    // implements AnnotatedElement
    public boolean isAnnotationPresent(java.lang.Class<? extends Annotation> annotationClass) {return false; }
    public <T extends Annotation> T getAnnotation(java.lang.Class<T> annotationClass) {return null;}
    public Annotation[] getAnnotations() {return new Annotation[0];}
    public <T extends Annotation> T[] getAnnotationsByType(java.lang.Class<T> annotationClass) {return null;}
    public <T extends Annotation> T getDeclaredAnnotation(java.lang.Class<T> annotationClass) {return null;}
    public <T extends Annotation> T[] getDeclaredAnnotationsByType(java.lang.Class<T> annotationClass) {return null;}
    public Annotation[] getDeclaredAnnotations() {return new Annotation[0];}
    // implements Type
    public String getTypeName() {return null;}

}
