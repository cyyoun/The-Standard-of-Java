package Array;

public class ArrayEx12 {
    public static void main(String[] args){
        String[] name = {"youn", "cha", "kim"};

        for(int i=0; i<name.length; i++){
            System.out.println(i+" : "+name[i]);
        }
        String tmp = name[2];
        System.out.println("tmp : "+tmp);
        name[0] = "chae";

        for(String str:name) //향상된 for문
            System.out.println(str);
    }
}
