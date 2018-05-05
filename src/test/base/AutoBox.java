package test.base;

public class AutoBox {
    public static void main(String[] args){
        int i = 10;
        Integer j = i;
        System.out.println(i + " : " + j);

        // jdk 1.4
        int x = 20;
        Integer y = new Integer(x);
        x = y.intValue();
        System.out.println(x + " : " + x);
        // 基本类型 -> 基本类型转换 -> 基本类型包装
        print(i);
    }

    public static void print(int i){
        System.out.println(i);
    }

    public static void print(double i){
        System.out.println(i);
    }

    public static void print(Integer i){
        System.out.println(i);
    }

    public static void print(Double i){
        System.out.println(i);
    }
}
