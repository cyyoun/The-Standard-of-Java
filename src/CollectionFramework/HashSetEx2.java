package CollectionFramework;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
    public static void main(String[] args){
        HashSet set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person("cyyoun", 10));
        set.add(new Person("cyyoun", 10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if (obj instanceof Person) {
            Person tmp = (Person) obj;
            return name.equals(tmp.name) && age==tmp.age;        }
        return false;
    }
    public int hashCode(){
        return Objects.hash(name, age);
    }
    public String toString(){
        return name+":"+age;
    }
}
