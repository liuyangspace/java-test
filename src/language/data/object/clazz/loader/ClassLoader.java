package language.data.object.clazz.loader;

//import jdk.internal.perf.PerfCounter;
//import sun.reflect.misc.ReflectUtil;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.stream.Stream;

/**
 * A class loader is an object that is responsible for loading classes.
 *
 *
 * @see java.lang.ClassLoader
 * @see jdk.internal.loader.ClassLoaders
 * @see jdk.internal.loader.ClassLoaders.BootClassLoader
 * @see jdk.internal.loader.ClassLoaders.PlatformClassLoader
 * @see jdk.internal.loader.ClassLoaders.AppClassLoader
 */
public abstract class ClassLoader extends java.lang.ClassLoader
{
    public String getName(){return super.getName();}
    /** 加载类 */
    public Class<?> loadClass(String name) throws ClassNotFoundException { return super.loadClass(name); }
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException{ return super.loadClass(name,resolve); }
    /** 查找类,资源 */
    protected Class<?> findClass(String name) throws ClassNotFoundException {return super.findClass(name);}
    protected Class<?> findClass(String moduleName, String name) {return super.findClass(moduleName,name);}
    // protected final Class<?> findLoadedClass(String name) {return super.findLoadedClass(name);}
    // protected final Class<?> findSystemClass(String name) throws ClassNotFoundException{}
    /** 定义 获取 类 */
    // protected final Class<?> defineClass([ClassLoader loader,] [String name,] byte[]|java.nio.ByteBuffer b, [int off, int len,] ProtectionDomain protectionDomain [, String source]) throws ClassFormatError{return super.defineClass(b,off,len);}
    // protected final void resolveClass(Class<?> c) {super.resolveClass(c);}
    protected Object getClassLoadingLock(String className) {return super.getClassLoadingLock(className);}
    protected static boolean registerAsParallelCapable() {return java.lang.ClassLoader.registerAsParallelCapable();}
    // public final boolean isRegisteredAsParallelCapable() { return ParallelLoaders.isRegistered(this.getClass()); }
    /** 资源 */
    public Stream<URL> resources(String name) {return super.resources(name);}
    protected URL findResource(String name) {
        return null;
    }
    protected Enumeration<URL> findResources(String name) throws IOException { return Collections.emptyEnumeration();}
    protected URL findResource(String moduleName, String name) throws IOException {return super.findResource(moduleName,name);}
    public URL getResource(String name) {return super.getResource(name);}//类加载时的目录
    public Enumeration<URL> getResources(String name) throws IOException {return super.getResources(name);}
    public static URL getSystemResource(String name) {
        return getSystemClassLoader().getResource(name);
    }
    public static Enumeration<URL> getSystemResources(String name) throws IOException { return getSystemClassLoader().getResources(name); }
    public InputStream getResourceAsStream(String name) {return super.getResourceAsStream(name);}
    public static InputStream getSystemResourceAsStream(String name) {return java.lang.ClassLoader.getSystemResourceAsStream(name);}
    /** 加载器 */
    public static java.lang.ClassLoader getPlatformClassLoader() {return java.lang.ClassLoader.getPlatformClassLoader();}
    public static java.lang.ClassLoader getSystemClassLoader() {return java.lang.ClassLoader.getSystemClassLoader();}
    // public final java.lang.ClassLoader getParent() {return super.getParent();}
    // protected final void setSigners(Class<?> c, Object[] signers) { c.setSigners(signers); }
    public void setDefaultAssertionStatus(boolean enabled) {super.setDefaultAssertionStatus(enabled);}
    public void setPackageAssertionStatus(String packageName, boolean enabled) {super.setPackageAssertionStatus(packageName,enabled);}
    public void setClassAssertionStatus(String className, boolean enabled) {super.setClassAssertionStatus(className,enabled);}
    public void clearAssertionStatus() {super.clearAssertionStatus();}
    /** 模块 包 */
    // public final Module getUnnamedModule() { return unnamedModule; }
    protected java.lang.Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase)
    {return super.definePackage(name,specTitle,specVersion,specVendor,implTitle,implVersion,implVendor,sealBase);}
    // public final Package getDefinedPackage(String name) {return super.getDefinedPackage(name);} return packages().toArray(Package[]::new); }
    protected java.lang.Package getPackage(String name) {return super.getPackage(name);}
    protected java.lang.Package[] getPackages() {return super.getPackages();}

    protected String findLibrary(String libname) {
        return null;
    }// Returns the absolute path name of a native library.


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
    public static void main(java.lang.String[] args)
    {
        System.out.println(java.lang.ClassLoader.getPlatformClassLoader());
        try {
            System.out.println(java.lang.ClassLoader.getSystemClassLoader().loadClass("language.data.object.clazz.reflect.Class"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //java.lang.ClassLoader loader = new java.lang.ClassLoader();
        //System.out.println((new java.lang.ClassLoader()).getName());
    }
}
