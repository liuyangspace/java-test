package language.data.object.classtype.reflect;

import java.lang.reflect.Member;
import java.lang.Class;

/**
 * he Modifier class provides {@code static} methods and
 * constants to decode class and member access modifiers.
 *
 * @see     java.lang.reflect.Modifier
 * @see Class#getModifiers()
 * @see Member#getModifiers()
 */
public class Modifier extends java.lang.reflect.Modifier {
    public static boolean isPublic(int mod) {return (mod & PUBLIC) != 0; }
    public static boolean isPrivate(int mod) { return (mod & PRIVATE) != 0; }
    public static boolean isProtected(int mod) { return (mod & PROTECTED) != 0; }
    public static boolean isStatic(int mod) { return (mod & STATIC) != 0; }
    public static boolean isFinal(int mod) { return (mod & FINAL) != 0; }
    public static boolean isSynchronized(int mod) { return (mod & SYNCHRONIZED) != 0; }
    public static boolean isVolatile(int mod) { return (mod & VOLATILE) != 0; }
    public static boolean isTransient(int mod) { return (mod & TRANSIENT) != 0; }
    public static boolean isNative(int mod) { return (mod & NATIVE) != 0; }
    public static boolean isInterface(int mod) { return (mod & INTERFACE) != 0; }
    public static boolean isAbstract(int mod) { return (mod & ABSTRACT) != 0; }
    public static boolean isStrict(int mod) { return (mod & STRICT) != 0; }
    public static String toString(int mod) { return java.lang.reflect.Modifier.toString(mod); }

    public static int classModifiers() { return java.lang.reflect.Modifier.classModifiers(); }
    public static int interfaceModifiers() { return java.lang.reflect.Modifier.classModifiers(); }
    public static int constructorModifiers() { return java.lang.reflect.Modifier.constructorModifiers(); }
    public static int methodModifiers() { return java.lang.reflect.Modifier.methodModifiers(); }
    public static int fieldModifiers() { return java.lang.reflect.Modifier.fieldModifiers(); }
    public static int parameterModifiers() { return java.lang.reflect.Modifier.parameterModifiers(); }
}
