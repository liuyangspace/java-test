package language.data.object;// 包名

import java.lang.*;// 引用类


/**
 * 类：class ClassName
 * 抽象类：abstract class ClassName
 * 接口：interface InterfaceName
 * 继承：class ClassName extends fatherClass
 * 实现接口：class ClassName implements interface
 * 修饰符:
 *      static 静态声明
 *      super() 父类的构造方法
 *      super.methodName(paraType paraName) 调用父类中的methodName()方法。
 *      final 类 ，不能够被继承，方法 ，不能被重载
 *      native 方法，用非java代码的接口(比如C)
 *      default 方法,Defender方法，或者虚拟扩展方法（Virtual extension methods)，接口内部默认的方法实现
 * 成员访问权限: public、protected、friendly（默认）、private
 * 成员变量: type varName;
 * 构造函数: className(para_type pare_name){}
 * 成员函数：return_type method_name(para_type paraname,[……, para_type paraname]){ method body;}
 */

class Object extends java.lang.Object //
{
    public Object() {}
    // 类
    public /* final native */ java.lang.Class<?> getClass(java.lang.Object parent){return super.getClass();}
    // public native int hashCode();
    public java.lang.String toString() {
        return super.toString();
    }
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }
    // protected native java.lang.Object clone() throws CloneNotSupportedException;
    // thread
    // public final native void notify();
    // public final native void notifyAll();
    // public final native void wait(long timeout) throws InterruptedException;
    // public final void wait(long timeout, int nanos) throws InterruptedException;
    // public final void wait() throws InterruptedException;
    protected void finalize() throws Throwable { } // 结束

    // 继承实现
    public Object clone()throws CloneNotSupportedException{
        return new Object();
    }

    /*
    private static native void registerNatives();
    static { registerNatives(); }
     */

    public static void main(java.lang.String[] args)
    {
        Object object = new Object();
        // getClass
        System.out.println("getClass():"+object.getClass());
        // hashCode
        System.out.println("hashCode():"+object.hashCode());
        // toString
        System.out.println("toString():"+object.toString());
        // clone
        try {
            System.out.println("clone ==():"+(object==object.clone()));//
            System.out.println("clone.getClass ==():"+(object.clone().getClass() ==object.getClass()));//
            System.out.println("clone equals():"+object.equals(object.clone()));//
        }catch (CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException():"+e.toString());
        }
        // equals ==
        System.out.println("equals():"+object.equals(object));//
        System.out.println("==():"+(object==object));//
        // thread
        try{
            synchronized(object){
                System.out.println("thread wait");
                object.wait(3000);// 线程在获取对象锁后，主动释放对象锁，同时本线程休眠。
                System.out.println("thread waiting");
                object.notify();// 其它线程调用对象的notify()唤醒该线程，继续获取对象锁，并继续执行。
                System.out.println("thread notify");
                object.notifyAll();
            }
        }catch (Exception e){
            System.out.println("thread Exception():"+e.toString());
        }
    }
}
