package gooduse.proxy;

public class Test {
    public static void main(String[] args) {
        A a = new Aa();
        a.print();
        A proxy = Proxy.proxy(a);
        proxy.print();
    }
}
