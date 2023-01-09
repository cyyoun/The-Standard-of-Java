package Array;

public class ArrayEx6 {
    public static void main(String[] args){
        int[] score = {14, 23, 46, 82, 18, 66};

        int max = score[0];
        int min = score[0];

        for(int i=1; i<score.length;i++){
            if(score[i]>max){
                max = score[i];
            } else if (score[i]<min) {
                min = score[i];
            }
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);
    }
}
