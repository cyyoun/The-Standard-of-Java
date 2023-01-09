package Array;

public class ArrayEx14 {
    public static void main(String[] args){
        String str = "ABCDE";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println("src.charAt(" + i + ") : " + ch);
        }

        char[] chArr = str.toCharArray();

        System.out.println(chArr);
    }
}
