package javase.data.object.clazz.reflect.proxy;

import java.lang.reflect.Method;

/**
 * {@code InvocationHandler} is the interface implemented by
 * the <i>invocation handler</i> of a proxy instance.
 *
 * @see java.lang.reflect.InvocationHandler
 */
public interface InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
