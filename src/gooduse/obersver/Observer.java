package gooduse.obersver;

import org.junit.Test;

/**
 * 观察者
 *  参例：swing/awt 对组件时间的监听，requestListener
 */
public class Observer {
    @Test
    public void test(){
        Person p = new Person();
        System.out.println("Person："+p.hashCode());
        p.addListener(new PersonListener() {
            @Override
            public void running(PersonEvent personEvent) {
                System.out.println("Person is running!");
                System.out.println("Source："+personEvent.getSource().hashCode());
                // throw new RuntimeException("Stop run!");
            }
        });
        p.run();
    }
}
