package test.javase.base.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {

    public static void main(String[] args){
        ExecutorService executors = Executors.newFixedThreadPool(3);
        for (int i=0;i<5;i++){
            executors.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(this+"  start !");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this+"  end !");
                }
            });
        }
        executors.shutdown();
    }
}
