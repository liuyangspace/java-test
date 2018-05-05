package test.base;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args){
        // 泛型在编译前运行，字节码里没有泛型
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");

        list.forEach((s)->{
            System.out.println(s);
        });

    }

    public static void print(List<String> strings){}
    // public static void print(List<Integer> strings){}
}
