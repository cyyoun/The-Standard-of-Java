package Generics;

import java.util.ArrayList;

class Fruit3{public String toString() {return "Fruit3";}}
class Apple3 extends Fruit3{public String toString() {return "Apple3";}}
class Grape3 extends Fruit3{public String toString() {return "Grape";}}
class Toy3 {public String toString() {return "Toy";}}


public class FruitBoxEx1 {
    public static void main(String[] args){
        Box2<Fruit3> Fruit3Box2 = new Box2<Fruit3>();
        Box2<Apple3> Apple3Box2 = new Box2<Apple3>();


//        Box2<Fruit3> testBox2 = new Box2<Grape>();
        Box2<Toy3> toyBox2 = new Box2<Toy3>();


        //Object타입의 ArrayList로 다른 매개변수 타입의 객체 지정 가능
        Fruit3Box2.add(new Fruit3());
        Fruit3Box2.add(new Apple3());

        Apple3Box2.add(new Apple3());
        Apple3Box2.add(new Apple3());

        toyBox2.add(new Toy3());

        System.out.println(Fruit3Box2);
        System.out.println(Apple3Box2);
        System.out.println(toyBox2);
    }
}


class Box2<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}