package gooduse.wrapper;

// 包装类
public class Wrapper extends A{
    private A a;

    public Wrapper(A a){
        this.a = a;
    }

    public String print(){
        System.out.println("this is Wrapper#print()!");
        return this.a.print();
    }
}