package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args){

        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++){
            System.out.print(numArr[i] = (int) (Math.random() * 10));
            //0~9
            //선언과 동시에 출력을 할 수 있는 ...???wow
        }
        //System.out.println(Arrays.toString((numArr)));
        System.out.println();

        for(int i=0; i<numArr.length-1; i++){
            boolean changed = false;

            for(int j=0; j<numArr.length-1-i; j++){
                if(numArr[j] > numArr[j+1]){
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true;
                }
            }
            if(!changed) break;
            //if 괄호절이 true 이면 break

            for(int k=0; k<numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }
    }
}
