package gooduse.proxy;
// 被代理的类
class Aa implements A {
    @Override
    public void print() {
        System.out.println("this is Aa print() !");
    }
}
