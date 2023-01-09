package OOP2;

import java.util.Vector;

class Product2{
    int price;
    int bounusPoint;

    Product2(int price){
        this.price = price;
        bounusPoint = (int) (price / 10.0);
    }
    Product2(){}
}

class Phone2 extends Product2{
    Phone2() {super(100);}
    public String toString(){ //toString() 오버라이딩인 듯
        return "Phone2";}
}

class Computer2 extends Product2{
    Computer2(){
        super(200);}
    public String toString(){
        return "Computer2";
    }
}
class Audio2 extends Product2{
    Audio2(){
        super(50);
    }
    public String toString(){
        return "Audio2";
    }
}

class Buyer2{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();


    void buy(Product2 p){
        if(money<p.price){
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return; //뭘 리턴하는거지..?
        }
        money -= p.price;
        bonusPoint += p.bounusPoint;
        item.add(p);
        System.out.println(p+"을/를 구매하셨습니다.");
    }
    void refund(Product2 p){
        if(item.remove(p)){
            money -= p.price;
            bonusPoint -= p.bounusPoint;
            System.out.println(p+"을/를 반품하셨습니다.");
        }else{
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for(int i=0; i<item.size(); i++){
            Product2 p = (Product2) item.get(i);
            sum += p.price;
            itemList += (i==0)? ""+p : ","+p;
        }

        System.out.println("구입하신 물건의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+" 입니다.");
        System.out.println("누적 포인트는 "+bonusPoint+" 입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args){
        Audio2 a = new Audio2();
        Buyer2 b = new Buyer2();
        b.buy(a);
        b.buy(new Computer2());
        b.refund((new Computer2())); //새로운 주소로 반품 안됨
        b.refund(a); //주소값이 동일한 참조변수를 인수로 넣어줘야 환불됨
        b.summary();

    }
}