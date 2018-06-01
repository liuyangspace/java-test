package language.data.object.clazz.reflect.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * 代理类，根据接口动态代理指定实例，修改其方法行为
 * {@code Proxy} provides static methods for creating objects that act like instances
 * of interfaces but allow for customized method invocation. To create a proxy instance for some interface {@code Foo}:
 * <pre>{@code
 *     InvocationHandler handler = new MyInvocationHandler(...);
 *     Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class<?>[] { Foo.class }, handler);
 * }</pre>
 * A <em>proxy class</em> is a class created at runtime that implements a specified
 * list of interfaces, known as <em>proxy interfaces</em>. A <em>proxy instance</em>
 * is an instance of a proxy class.
 *
 * @see     InvocationHandler
 * @see     java.lang.reflect.Proxy
 */
public class Proxy extends java.lang.reflect.Proxy implements java.io.Serializable {

    protected Proxy(InvocationHandler h) { super(h); }

    public static Class<?> getProxyClass(ClassLoader loader, Class<?>... interfaces) throws IllegalArgumentException
        { return java.lang.reflect.Proxy.getProxyClass(loader,interfaces); }

    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        { return java.lang.reflect.Proxy.newProxyInstance(loader,interfaces,h); }

    public static boolean isProxyClass(Class<?> cl) {return java.lang.reflect.Proxy.isProxyClass(cl);}

    public static InvocationHandler getInvocationHandler(Object proxy) throws IllegalArgumentException
        {return java.lang.reflect.Proxy.getInvocationHandler(proxy);}
}
