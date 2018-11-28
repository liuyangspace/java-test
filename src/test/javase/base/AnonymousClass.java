package test.javase.base;

import java.io.IOException;
import java.nio.CharBuffer;

public class AnonymousClass {

    // 匿名内部类 new 接口
    public Readable read = new Readable(){
        @Override
        public int read(CharBuffer cb) throws IOException {
            return 0;
        }
    };

    public static void main(String[] args){
        Thread t = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(1);
                    System.out.println("sleep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
