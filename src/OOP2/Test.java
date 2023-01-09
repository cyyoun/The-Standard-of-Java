package OOP2;

class Car{
    String model;
    String color;

    public Car(){
        this.model = "경차";
        this.color = "흰색";
        System.out.println("매개변수가 없는 기본 Car 생성자");
    }
    public Car(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("매개변수가 있는 Car 생성자");
    }

    public void P(){
        System.out.println("모델명 : " + model);
        System.out.println("색상 : " + color);
    }

}

class Taxi extends Car{
    Boolean taxiMeter;
    int taxiFare = 1000;

    public Taxi(){
        super();
    }

    public Taxi(String model, String color){
        super(model, color);
    }

    public Taxi(String model, String color, boolean taxiMeter, int taxiFare){
        super(model, color);
        this.taxiMeter = taxiMeter;
        this.taxiFare = taxiFare;
    }

    public void power(){
        taxiMeter =! taxiMeter;
    }

    public void P(){
        super.P();
        if (taxiMeter == true) {
            System.out.println("요금은 ~~~ " +taxiFare);
        }
        else{
            System.out.println("미터기가 꺼져있습니다.");
        }
    }
}

public class Test {
    public static void main(String[] args){
        Taxi t = new Taxi();
        t.taxiMeter = true ;
        t.P();

    }
}
