package LangPackage;

class Point implements Cloneable{
    //Cloneable 인터페이스를 구현한 클래스에만 clone() 호출가능
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x="+x+", y="+y;
    }
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){}
            return obj;
        }
}
public class CloneEx1 {
    public static void main(String args[]){
        Point orgin = new Point(3, 5);
        Point copy = (Point) orgin.clone();
        System.out.println(orgin);
        System.out.println(copy);
    }
}
