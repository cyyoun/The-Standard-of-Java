package OOP2;

import java.util.Arrays;

class Product{
    int price;
    int bounusPoint;

    Product(int price){
        this.price = price;
        bounusPoint = (int) (price / 10.0);
    }
    Product(){}
}

class Phone extends Product{
    Phone() {super(100);}
    public String toString(){ //toString() 오버라이딩인 듯
        return "Phone";}
}

class Computer extends Product{
    Computer(){
        super(200);}
    public String toString(){
        return "Computer";
    }
}
class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return; //뭘 리턴하는거지..?
        }
        money -= p.price;
        bonusPoint += p.bounusPoint;
//        System.out.println(i);
        item[i] = p;
        i++;
        System.out.println(p+"을/를 구매하셨습니다.");
//        System.out.println(Arrays.toString(item));
    }
    void summary(){
        int sum = 0;
        String itemList = "";

    for(int i=0; i<item.length; i++){
        if(item[i]==null) {
            break;
        }
        else {
            sum += item[i].price;
            itemList += item[i].toString() + ", ";
        }
    }
        System.out.println("구입하신 물건의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+" 입니다.");
        System.out.println("누적 포인트는 "+bonusPoint+" 입니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args){
        Buyer b = new Buyer();
        b.buy(new Audio());
        b.buy(new Computer());
        b.summary();

    }
}
