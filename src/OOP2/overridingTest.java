package OOP2;

public class overridingTest {
    public static void main(String[] args){
        sonOverride s = new sonOverride(3);

    }
}
class sonOverride extends ParentOverride{
    sonOverride(){
        System.out.println("자손 생성자");
    }
//    super(){
//        System.out.println("메롱");
//    }
    sonOverride(int Test){

//        super();
        System.out.println(Test+"자손 생성자");
    }
}
class ParentOverride {

    ParentOverride(){
        System.out.println("조상 생성자");
    }
    ParentOverride(int Test2){
        System.out.println(Test2+"조상 생성자");
    }
}
