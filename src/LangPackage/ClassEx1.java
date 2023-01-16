package LangPackage;

final class Card3{
    String kind;
    int number;

    Card3() {
        this("Spade", 1);
    }
    public Card3(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString(){
        return kind +":"+number;
    }
}
public class ClassEx1 {
    public static void main(String argsp[]) throws Exception {
        Card3 c = new Card3("Heart", 3);
        Card3 c2 = Card3.class.newInstance();

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
