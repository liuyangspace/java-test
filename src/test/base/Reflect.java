package test.base;

import java.lang.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflect {

    public int i;
    private String s;

    public  Reflect(){
        System.out.println("默认构造");
    }

    private  Reflect(int i,String s){
        this.i = i;
        this.s = s;
        System.out.println("私有构造 int="+i+" String="+s);
    }

    public String print(){
        System.out.println("public String print()");
        return "print";
    }

    private String print(String s){
        System.out.println("private String print( "+s+" )");
        return "print";
    }

    @Override
    public String toString() {
        return " int="+i+" String="+s;
    }

    public static void main(String[] args){
        System.out.println("this is main()");
    }
}

class ReflectTest{
    public static void main(String[] args) throws Exception {
        //
        System.out.println(Class.forName("language.data.object.clazz.reflect.Class"));
        //
        System.out.println(Class.class);
        //
        Object list = new ArrayList();
        Class clazz = list.getClass();
        System.out.println(clazz);

        // 获得类
        Class aClass = Class.forName("test.base.Reflect");
        // 公有构造实例
        Constructor constructor = aClass.getConstructor();
        Object object = constructor.newInstance();
        System.out.println(object);
        // 私有构造实例
        Constructor constructorPrivate = aClass.getDeclaredConstructor(int.class,String.class);
        constructorPrivate.setAccessible(true);
        Object object1 = constructorPrivate.newInstance(123,"test");
        System.out.println(object1);
        // 获得 公有 属性
        Field fieldI = aClass.getField("i");
        Object i = fieldI.get(object1);
        System.out.println(i);
        // 获得 私有 属性
        Field fieldS = aClass.getDeclaredField("s");
        fieldS.setAccessible(true);
        Object s = fieldS.get(object1);
        System.out.println(s);
        // 设置 属性
        fieldS.set(object1,"test_this");
        System.out.println(object1);
        // 获得 公有 方法 执行
        Method method = aClass.getMethod("print");
        method.invoke(object1);
        // 获得 私有 方法 执行
        Method methodPrivate = aClass.getDeclaredMethod("print",String.class);
        methodPrivate.setAccessible(true);
        methodPrivate.invoke(object1,"private_test");
        // main 方法 执行
        Method methodMain = aClass.getMethod("main",String[].class);
        methodMain.invoke(null,(Object) new String[]{""});
    }
}