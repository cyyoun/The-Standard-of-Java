package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Fruit{
    String name;
    int weight;

    Fruit(String name, int weight){
        this.name = name;
        this.weight = weight;

    }
    public String toString() {return name +"("+weight+")";}
}

class Apple extends Fruit{
    Apple(String name, int weight){
        super(name, weight);
    }
}
class Grape extends Fruit{
    Grape(String name, int weight){
        super(name, weight);
    }
}
class AppleComp implements Comparator<Apple>{
    public int compare(Apple t1, Apple t2){
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape>{
    public int compare(Grape t1, Grape t2){
        return t2.weight - t1.weight;
    }
}
class FruitComp implements Comparator<Fruit>{
    public int compare(Fruit t1, Fruit t2){
        return t2.weight - t1.weight;
    }
}
public class FruitBoxEx3 {
    public static void main(String[] args){
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("GrrenApple", 300));
        appleBox.add(new Apple("GrrenApple", 100));
        appleBox.add(new Apple("GrrenApple", 200));

        grapeBox.add(new Grape("GrrenGrape", 400));
        grapeBox.add(new Grape("GrrenGrape", 300));
        grapeBox.add(new Grape("GrrenGrape", 200));

        System.out.println(appleBox);
        Collections.sort(appleBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}


class FruitBox<T extends Fruit> extends Box<T>{}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    ArrayList<T> getList() {return list;}

    int size() {
        return list.size();
    }
    public String toString() {
        return list.toString();
    }

}