package Array;

public class ArrayEx3 {
    public static void main(String[] args){
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = i + 1;
        }

        System.out.println("변경 전 : " + arr.length);

        int[] tmp = new int[arr.length * 2];

        for(int i=0; i<arr.length; i++){
            tmp[i] = arr[i];
        }
        arr = tmp; //tmp에 저장된 값을 arr에 저장

        System.out.println("변경 후 : " + arr.length);
    }
}
