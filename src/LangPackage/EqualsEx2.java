package LangPackage;


class Person{
    long id;
    public boolean equals(Object obj){
        if (obj instanceof Person)
            return id == ((Person)obj).id;
        else
            return false;
    }
    Person(long id){
        this.id = id;
    }
}
public class EqualsEx2 {
    public static void main(String args[]){
        Person p1 = new Person(123L);
        Person p2 = new Person(1234L);

        if(p1==p2)
            System.out.println("같다");
        else
            System.out.println(p1);
            System.out.println(p2);
            System.out.println("다르다");
        if(p1.equals(p2)) {
            System.out.println(p1);
            System.out.println(p2);
            System.out.println("같다");
        }
        else
            System.out.println("다르다");
    }
}
