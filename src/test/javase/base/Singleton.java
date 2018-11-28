package test.javase.base;

public class Singleton {

    public static final int MAN = 1;
    public static final int FEMALE = 2;

    private String s;

    private static Singleton instance ;

    private static Singleton instanceMan = new Singleton("男");
    private static Singleton instanceFemale = new Singleton("女");

    private Singleton(){

    }

    private Singleton(String s){
        this.s = s;
    }

    // 单例
    public synchronized static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    // 多例
    public synchronized static Singleton getMoreInstance(int type){
        if(MAN == type) return instanceMan;
        if(FEMALE == type) return instanceFemale;
        return null;
    }
}

class SingletonTest {
    public static void main(String[] args){
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getMoreInstance(Singleton.MAN));
        System.out.println(Singleton.getMoreInstance(Singleton.FEMALE));
    }
}