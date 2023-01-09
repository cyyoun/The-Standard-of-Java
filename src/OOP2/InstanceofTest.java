package OOP2;



class Car2{}
class FireEngine extends Car2{}

class InstanceofTest{
    public static void main(String[] args){
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("This is a FireEngine");
        }

        if(fe instanceof Car2){
            System.out.println("This is a Car2");
        }

        if(fe instanceof Object){
            System.out.println("This is a Object");
        }
        System.out.println(fe.getClass().getName()); //클래스이름 출력
    }
}