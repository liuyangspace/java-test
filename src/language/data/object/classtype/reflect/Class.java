package language.data.object.classtype.reflect;

import java.lang.String;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

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
 *  Class.forName(className, true, currentLoader);
 *  Class.forName("Foo", true, this.getClass().getClassLoader())
 *  clazz.getDeclaredConstructor().newInstance()
 *  getName():
 *      String.class.getName() returns "java.lang.String"
 *      byte.class.getName() returns "byte"
 *      (new Object[3]).getClass().getName() returns "[Ljava.lang.Object;"
 *      (new int[3][4][5][6][7][8][9]).getClass().getName() returns "[[[[[[[I"
 *
 * @see java.lang.Class
 * @see java.lang.ClassLoader#defineClass(byte[], int, int)
 * @see java.lang.reflect.Constructor
 */

public final class Class<T> /* extends java.lang.Class */ implements java.io.Serializable,GenericDeclaration,Type,AnnotatedElement
{
    java.lang.Class<T> aClass;
    // private Class(){} // 私有构造
    public String toString(){ return aClass.toString(); }
    public String toGenericString() { return aClass.toGenericString(); }
    public static java.lang.Class<?> forName(String className)throws ClassNotFoundException { return java.lang.Class.forName(className);}//根据类名实例化
    public static java.lang.Class<?> forName(String className, boolean initialize, ClassLoader loader) throws ClassNotFoundException {return java.lang.Class.forName(className,initialize,loader);}//根据类名实例化
    public static java.lang.Class<?> forName(Module module, String name) {return java.lang.Class.forName(module,name);}

    /* implements */
    // implements GenericDeclaration
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

    // Instance Object
    public T newInstance() throws InstantiationException, IllegalAccessException { return aClass.newInstance(); }

    // is ...
    public native boolean isInstance(Object obj);
    public native boolean isAssignableFrom(java.lang.Class<?> cls);// 是否为 指定 类或子类
    public native boolean isInterface();
    public native boolean isArray();
    public native boolean isPrimitive();
    public boolean isAnnotation() { return aClass.isAnnotation(); }
    public boolean isSynthetic() { return aClass.isSynthetic(); }

    // get ...
    public String getName() {return aClass.getName();}
    public ClassLoader getClassLoader() {return aClass.getClassLoader();}
    public Module getModule() { return aClass.getModule(); }
    public native java.lang.Class<? super T> getSuperclass();
    public Type getGenericSuperclass() {return aClass.getGenericSuperclass();}
    public Package getPackage() {return aClass.getPackage();}
    public String getPackageName() {return aClass.getPackageName();}
    public java.lang.Class<?>[] getInterfaces() {return aClass.getInterfaces();}
    public Type[] getGenericInterfaces() {return aClass.getGenericInterfaces();}

    public TypeVariable<java.lang.Class<T>>[] getTypeParameters(){ return aClass.getTypeParameters(); }

    // Signers
    public native Object[] getSigners();
    native void setSigners(Object[] signers);

    // member
    public Method getEnclosingMethod() throws SecurityException {return aClass.getEnclosingMethod();}// 定义此匿名类或内部类的方法
    public Constructor<?> getEnclosingConstructor() throws SecurityException { return aClass.getEnclosingConstructor(); }
}
