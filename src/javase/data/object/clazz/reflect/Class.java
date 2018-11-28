package javase.data.object.clazz.reflect;

import java.io.InputStream;
import java.lang.String;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.net.URL;

/**
 * Instances of the class {@code Class} represent classes and
 * interfaces in a running Java application.
 *
 *
 * 获取 Class:
 *      Class,forName(String className)
 *      obj.getClass()
 *      int.class       // 基础类型
 *      String[].class  // 数组
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
    java.lang.Class<T> $this;
    // private Class(){} // 私有构造
    public String toString(){ return $this.toString(); }
    public String toGenericString() { return $this.toGenericString(); }
    public static java.lang.Class<?> forName(String className)throws ClassNotFoundException { return java.lang.Class.forName(className);}//根据类名实例化
    public static java.lang.Class<?> forName(String className, boolean initialize, ClassLoader loader) throws ClassNotFoundException {return java.lang.Class.forName(className,initialize,loader);}//根据类名实例化
    public static java.lang.Class<?> forName(Module module, String name) {return java.lang.Class.forName(module,name);}
    // Instance Object
    public T newInstance() throws InstantiationException, IllegalAccessException { return $this.newInstance(); }
    // is ...
    public native boolean isInstance(Object obj);
    public native boolean isAssignableFrom(java.lang.Class<?> cls);// 是否为 指定 类或子类
    public native boolean isInterface();
    public native boolean isArray();
    public native boolean isPrimitive();
    public boolean isAnnotation() { return $this.isAnnotation(); }
    public boolean isSynthetic() { return $this.isSynthetic(); }
    public boolean isAnonymousClass() {return $this.isAnonymousClass();}
    public boolean isLocalClass() {return $this.isLocalClass();}
    public boolean isMemberClass(){return $this.isMemberClass();}
    // get ...
    public String getName() {return $this.getName();}
    public String getSimpleName() {return $this.getSimpleName();}
    public String getTypeName() {return $this.getTypeName();}
    public String getCanonicalName() {return $this.getCanonicalName();}
    public ClassLoader getClassLoader() {return $this.getClassLoader();}
    public Module getModule() { return $this.getModule(); }
    public native java.lang.Class<? super T> getSuperclass();
    public Type getGenericSuperclass() {return $this.getGenericSuperclass();}
    public Package getPackage() {return $this.getPackage();}
    public String getPackageName() {return $this.getPackageName();}
    public java.lang.Class<?>[] getInterfaces() {return $this.getInterfaces();}
    public Type[] getGenericInterfaces() {return $this.getGenericInterfaces();}
    public boolean desiredAssertionStatus() {return $this.desiredAssertionStatus();}
    //
    public T cast(Object obj) {return $this.cast(obj);}
    public <U> java.lang.Class<? extends U> asSubclass(java.lang.Class<U> clazz) {return $this.asSubclass(clazz);}
    // Enum
    public boolean isEnum() {return $this.isEnum();}
    public T[] getEnumConstants() {return $this.getEnumConstants();}
    // Signer
    public native Object[] getSigners();
    native void setSigners(Object[] signers);
    // class
    public java.lang.Class<?>[] getClasses() {return $this.getClasses();}
    public java.lang.Class<?>[] getDeclaredClasses() throws SecurityException {return $this.getDeclaredClasses();}
    public java.lang.Class<?> getDeclaringClass() throws SecurityException {return $this.getDeclaringClass();}
    // Field
    public Field[] getFields() throws SecurityException {return $this.getFields();}
    public Field[] getDeclaredFields() throws SecurityException {return $this.getDeclaredFields();}
    public Field getField(String name) throws NoSuchFieldException, SecurityException {return $this.getField(name);}
    public Field getDeclaredField(String name)throws NoSuchFieldException, SecurityException{return $this.getDeclaredField(name);}
    // Constructor
    public Constructor<?>[] getConstructors() throws SecurityException {return $this.getConstructors();}
    public Constructor<?>[] getDeclaredConstructors() throws SecurityException {return $this.getDeclaredConstructors();}
    public Constructor<T> getConstructor(java.lang.Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException
        { return $this.getConstructor(); }
    public Constructor<T> getDeclaredConstructor(java.lang.Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException
        { return $this.getDeclaredConstructor(parameterTypes); }
    // Method
    public Method[] getDeclaredMethods() throws SecurityException {return $this.getDeclaredMethods();}
    public Method getMethod(String name, java.lang.Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException
        { return $this.getMethod(name,parameterTypes); }
    public Method getDeclaredMethod(String name, java.lang.Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException
        { return $this.getDeclaredMethod(name,parameterTypes);}
    // Resource
    public InputStream getResourceAsStream(String name) {return $this.getResourceAsStream(name);}
    public URL getResource(String name) {return $this.getResource(name);}
    // Security
    public java.security.ProtectionDomain getProtectionDomain() {return $this.getProtectionDomain();}
    // 泛型
    public TypeVariable<java.lang.Class<T>>[] getTypeParameters(){ return $this.getTypeParameters(); }
    // 匿名类 构造此类的父成员（类，方法，代码段。。。）
    public Method getEnclosingMethod() throws SecurityException {return $this.getEnclosingMethod();}// 定义此匿名类或内部类的方法
    public Constructor<?> getEnclosingConstructor() throws SecurityException { return $this.getEnclosingConstructor(); }
    public java.lang.Class<?> getEnclosingClass() throws SecurityException {return $this.getEnclosingClass();}
    // Annotation
    public boolean isAnnotationPresent(java.lang.Class<? extends Annotation> annotationClass) {return $this.isAnnotationPresent(annotationClass);}
    public <T extends Annotation> T getAnnotation(java.lang.Class<T> annotationClass) {return $this.getAnnotation(annotationClass);}
    public Annotation[] getAnnotations() {return $this.getAnnotations();}
    public <T extends Annotation> T[] getAnnotationsByType(java.lang.Class<T> annotationClass) {return $this.getAnnotationsByType(annotationClass);}
    public <T extends Annotation> T getDeclaredAnnotation(java.lang.Class<T> annotationClass) {return $this.getDeclaredAnnotation(annotationClass);}
    public <T extends Annotation> T[] getDeclaredAnnotationsByType(java.lang.Class<T> annotationClass) {return $this.getDeclaredAnnotationsByType(annotationClass);}
    public Annotation[] getDeclaredAnnotations() {return $this.getDeclaredAnnotations();}
    public AnnotatedType getAnnotatedSuperclass() {return $this.getAnnotatedSuperclass();}
    public AnnotatedType[] getAnnotatedInterfaces() {return $this.getAnnotatedInterfaces();}

}
