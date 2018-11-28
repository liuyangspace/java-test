package test.javase.base;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (String d:list){
            System.out.println(d);
        }

        list.forEach((s)->{
            System.out.println(s);
        });

        String[] s = {"x","y","z"};

        for (String t:s) {
            System.out.println(t);
        }
    }
}
