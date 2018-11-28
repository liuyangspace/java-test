package test.javase.base.thread;

import org.junit.Test;

import java.util.function.Function;

public class StackWalker {

    public static void main(String[] args){
        new StackWalker().forEach();
    }

    @Test
    public void walk(){
        Function f = new Function() {
            @Override
            public Object apply(Object o) {
                System.out.println(o);
                return null;
            }
        };
        java.lang.StackWalker.getInstance(java.lang.StackWalker.Option.SHOW_HIDDEN_FRAMES).walk(f);
    }

    @Test
    public void forEach(){
        java.lang.StackWalker.getInstance(java.lang.StackWalker.Option.SHOW_REFLECT_FRAMES) .forEach(System.out::println);
    }

    @Test
    public void getCallerClass(){
        System.out.println(java.lang.StackWalker.getInstance(java.lang.StackWalker.Option.RETAIN_CLASS_REFERENCE).getCallerClass());
    }

}
