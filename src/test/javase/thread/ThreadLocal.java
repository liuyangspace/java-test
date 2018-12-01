package test.javase.thread;

import java.util.Random;

public class ThreadLocal {

    java.lang.ThreadLocal<Object> local = new java.lang.ThreadLocal<Object>();

    public Object getLocal(){
        if(local.get()==null){
            local.set(new Random().nextInt(1000));
        }
        return local.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println("main:"+threadLocal.getLocal());
        System.out.println("main:"+threadLocal.getLocal());
        new Thread(){
            public void run(){
                ThreadLocal threadLocal = new ThreadLocal();
                System.out.println("threadLocal:"+threadLocal.getLocal());
                System.out.println("threadLocal:"+threadLocal.getLocal());
            }
        }.start();
        Thread.currentThread().sleep(100);
        System.out.println("main:"+threadLocal.getLocal());
    }


}
