package language.data.object.classtype.reflect.member.executable;


import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;

/**
 * A {@code Method} provides information about, and access to, a single method
 * on a class or interface.  The reflected method may be a class method
 * or an instance method (including an abstract method).
 *
 * 泛型方法在反射时编译器会自动生成 桥接方法 以兼容JDK1.5以前的 .class 码
 *
 * @see java.lang.reflect.Method
 * @see Member
 * @see java.lang.reflect.Executable
 * @see java.lang.Class
 * @see java.lang.Class#getMethods()
 * @see java.lang.Class#getMethod(String, java.lang.Class[])
 * @see java.lang.Class#getDeclaredMethods()
 * @see java.lang.Class#getDeclaredMethod(String, Class[])
 */
public class Method // extends Executable // extends java.lang.reflect.Method
{
    private java.lang.reflect.Method method;
    // toString
    public String getName() { return method.getName(); }
    public String toString() { return method.toString(); }
    public String toGenericString() { return method.toGenericString(); }
    //
    public Class<?> getDeclaringClass() { return method.getDeclaringClass(); }
    public int getModifiers() { return method.getModifiers(); }
    // 泛型
    public TypeVariable<java.lang.reflect.Method>[] getTypeParameters() {return method.getTypeParameters(); }
    // invoke Access
    public void setAccessible(boolean flag) { method.setAccessible(flag); }
    public Object invoke(Object obj, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException { return method.invoke(obj,args); }
    // return
    public Class<?> getReturnType() { return method.getReturnType(); }
    public Type getGenericReturnType() { return method.getGenericReturnType(); }
    // Parameter
    public Class<?>[] getParameterTypes() { return method.getParameterTypes(); }
    public int getParameterCount() { return method.getParameterCount(); }
    public Type[] getGenericParameterTypes() {return method.getGenericParameterTypes();}
    // Exception
    public Class<?>[] getExceptionTypes() { return method.getExceptionTypes(); }
    public Type[] getGenericExceptionTypes() { return method.getGenericExceptionTypes(); }
    // is
    public boolean isBridge() {return method.isBridge();}
    public boolean isVarArgs() { return method.isVarArgs(); }// 方法是否由Java语言规范定义的合成方法
    public boolean isDefault() { return method.isDefault(); }
    public Object getDefaultValue() { return method.getDefaultValue(); }
    //
    public boolean equals(Object obj) {return method.equals(obj);}
    public int hashCode() { return method.hashCode(); }
    // Annotation
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { return method.getAnnotation(annotationClass); }
    public Annotation[] getDeclaredAnnotations()  { return method.getDeclaredAnnotations(); }
    public Annotation[][] getParameterAnnotations() { return method.getParameterAnnotations(); }
    public AnnotatedType getAnnotatedReturnType() { return method.getAnnotatedReturnType(); }

}
