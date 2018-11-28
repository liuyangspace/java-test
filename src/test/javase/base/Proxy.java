package test.javase.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy {

    public interface Test{
        void test();
    }

    public class TestClass implements Test {

        @Override
        public void test() {
            System.out.println("this is test method !");
        }
    }

    @org.junit.Test
    public void proxy(){
        Test test = (Test) java.lang.reflect.Proxy.newProxyInstance(Proxy.class.getClassLoader(), new Class[]{Test.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("method name = " + method.getName());
                return null;
            }
        });
        test.test();
    }

    @org.junit.Test
    public void testObject(){
        Test test = new TestClass();
        Test testProxy = (Test) java.lang.reflect.Proxy.newProxyInstance(test.getClass().getClassLoader(), new Class[]{Test.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("this is proxy method !");
                return method.invoke(test,args);
            }
        });
        testProxy.test();
    }
}
