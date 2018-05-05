package test.base;

public class Varargs {
    public static void main(String[] args){

        System.out.println("你好".toCharArray().length);
        System.out.println("你好".getBytes().length);

        System.out.println("hi".toCharArray().length);

        String[] s = {"x","y","z"};
        print("a","b","c","d");
        print(s);
        print();
    }

    public static void print(String... i){
        for (int j=0 ; j<i.length ;j++){
            System.out.println(i[j]);
        }
    }
}
