package gooduse.wrapper;

public class Test {
    @org.junit.Test
    public void test(){
        A a = new A();
        System.out.println(a.print());
        Wrapper wrapper = new Wrapper(a);
        System.out.println(wrapper.print());
    }
}
