package test.javase.base;

//import javax.servlet.GenericServlet;

public class ThisClass extends Parent {
    public String name ;//= "thisName";

    public ThisClass(){
        this.name = "thisName";
    }

    protected void print(){
        super.print();
        System.out.println(this);
        System.out.println(this.name);
        this.echo();
    }

    protected void echo(){
        System.out.println("thisEcho");
    }

    // public String getName(){
    //     return this.name;
    // }

    public String setName(String name){

        return this.name=name;
    }

    public static void main(String[] args){
        ThisClass thisClass = new ThisClass();
        thisClass.print();

        System.out.println("*************************************");
        Parent parent = new ThisClass();
        System.out.println(parent.name);
        System.out.println(((ThisClass)parent).name);

        System.out.println("*************************************");
        ThisClass thisClass2 = new ThisClass();
        System.out.println(thisClass2.name);
        System.out.println(thisClass2.getName());
        System.out.println("*************************************");
        System.out.println(thisClass2.setName("tom"));
        System.out.println(thisClass2.getName());

    }
}

class Parent{
    public String name ;//= "parentName";

    public Parent(){
        //this.name = "parentName";
    }

    public Parent(String s){
        this.name = "parentName";
    }

    protected void print(){
        System.out.println(this);
        System.out.println(this.name);
        this.echo();
    }

    protected void echo(){
        System.out.println("parentEcho");
    }

    public String setName(String name){
        return this.name=name;
    }

    public String getName(){
        return this.name;
    }
}

abstract class Test{

}
