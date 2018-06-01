package gooduse.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy {

    public static A proxy(A a) {
        Object object = java.lang.reflect.Proxy.newProxyInstance(a.getClass().getClassLoader(), new java.lang.Class[]{A.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("print")){
                    System.out.println("this is Proxy print() !");
                }
                return method.invoke(a);
            }
        });
        return (A)object;
    }

}
