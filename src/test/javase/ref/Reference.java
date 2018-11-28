package test.javase.ref;

import org.junit.Test;

import java.lang.ref.WeakReference;

public class Reference {

    @Test
    public void strongReference(){ // 强引用
        A a = new A();
        a = null;
        System.gc();
        System.out.println("strongReference over!");
    }

    @Test
    public void weakReference(){ // 强引用
        WeakReference a = new WeakReference<A>(new A());
        System.gc();
        a = null;
        System.out.println("weakReference over!");
    }

    public class A{
        @Override
        protected void finalize() throws Throwable {
            System.out.println("A is finalize!");
        }
    }
}
