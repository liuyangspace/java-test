package language.data.object.loader;

//import jdk.internal.perf.PerfCounter;
//import sun.reflect.misc.ReflectUtil;

public abstract class ClassLoader extends java.lang.ClassLoader
{
    public String getName(){return super.getName();}
    // 加载类
    public Class<?> loadClass(String name) throws ClassNotFoundException { return super.loadClass(name); }
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException{ return super.loadClass(name,resolve); }
    // 查找类
    protected Class<?> findClass(String name) throws ClassNotFoundException {return super.findClass(name);}
    protected Class<?> findClass(String moduleName, String name) {return super.findClass(moduleName,name);}
    // 定义类
    // protected final Class<?> defineClass([ClassLoader loader,] [String name,] byte[]|java.nio.ByteBuffer b, [int off, int len,] ProtectionDomain protectionDomain [, String source]) throws ClassFormatError{return super.defineClass(b,off,len);}
    protected Object getClassLoadingLock(String className) {return super.getClassLoadingLock(className);}
    //
    // protected final void resolveClass(Class<?> c) {super.resolveClass(c);}
    // protected final Class<?> findSystemClass(String name) throws ClassNotFoundException{}

    /* 内部属性 */
    // private final ClassLoader parent;
    // private final String name;
    // private final Module unnamedModule;
    // private final ConcurrentHashMap<String, Object> parallelLockMap;
    // private final Map <String, Certificate[]> package2certs;
    // private static final Certificate[] nocerts = new Certificate[0];
    // private final Vector<Class<?>> classes = new Vector<>();
    // private final ProtectionDomain defaultDomain = new ProtectionDomain(new CodeSource(null, (Certificate[]) null), null, this, null);
    // private final ConcurrentHashMap<String, NamedPackage> packages = new ConcurrentHashMap<>();

    /* 内部方法 */
    // final String name() {}
    // private static native void registerNatives();
    // static { registerNatives(); }
    // private static class ParallelLoaders {}
    // void addClass(Class<?> c) {}
    // private NamedPackage getNamedPackage(String pn, Module m) {}
    // private static Void checkCreateClassLoader([String name]) {}
    // private|protected ClassLoader([Void unused,] [String name,] ClassLoader parent) {}
    // final Class<?> loadClass(Module module, String name) {}
    // final Class<?> loadClass(Module module, String name) {}
    // private Class<?> loadClassInternal(String name) throws ClassNotFoundException {}
    // private void checkPackageAccess(Class<?> cls, ProtectionDomain pd) {}
    // private ProtectionDomain preDefineClass(String name, ProtectionDomain pd){}
    // private boolean checkName(String name){}
    // private void checkCerts(String name, CodeSource cs){}
    // private boolean compareCerts(Certificate[] pcerts, Certificate[] certs){}
    // Class<?> findBootstrapClassOrNull(String name){}
}
