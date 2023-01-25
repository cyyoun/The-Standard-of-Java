package Generics;


import java.util.ArrayList;

class Fruit32 implements Eatable{
    public String toString() {return "Fruit3";}
}
class Apple32 extends Fruit32{public String toString() {return "Apple3";}}
class Apple33 extends Apple32{public String toString() {return "미니애플";}}
class Grape2 extends Fruit32{public String toString() {return "Grape";}}
class Toy2{public String toString() {return "Toy";}}

interface Eatable{}

public class FruitBoxEx2 {
    public static void main(String[] args){
        Fruit3Box2<Fruit32> Fruit32Box2 = new Fruit3Box2<Fruit32>();
        Fruit3Box2<Apple32> Apple32Box2 = new Fruit3Box2<Apple32>();
        Fruit3Box2<Grape2> grape2Box2 = new Fruit3Box2<Grape2>();
//        Fruit3Box2<Toy2> toyBox2 = new Fruit3Box2<Toy2>(); //에러.

        Fruit32Box2.add(new Fruit32());
        Apple32Box2.add(new Apple33());
        Fruit32Box2.add(new Apple32());
        Fruit32Box2.add(new Grape2());
        Apple32Box2.add(new Apple32());
//        Apple32Box2.add(new Grape2()); //에러. Grape2는 Apple32의 자손이 아님

        System.out.println(Fruit32Box2);
        System.out.println(Apple32Box2);
    }
}

class Fruit3Box2<T extends Fruit32 & Eatable> extends Box3<T>{}

class Box3<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {list.add(item);}
//    T get(int i){return list.get(i);}
//    int size(){return list.size();}
    public String toString(){return list.toString();}
}
