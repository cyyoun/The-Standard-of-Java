package OOP2;

public class BindingTest2 {
    public static void main(String[] args){
        Parent2 p = new Parent2();
        Child2 c = new Child2();

        System.out.println(p.x);
        p.method();

        System.out.println(c.x);
        c.method();
    }
}

 class Parent2{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}
class Child2 extends Parent2{

}
