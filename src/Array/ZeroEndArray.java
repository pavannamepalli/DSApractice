package Array;

public class ZeroEndArray {

    public static void main(String[] args) {
        int nonZeroIndex = 0;

        int[] arr ={0, 5, 0, 15, 1, 0, 75, 0, 23, 47, 0, 69, 81, 0};


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
               int temp = arr[i];
               arr[i]=arr[nonZeroIndex];
               arr[nonZeroIndex] = temp;
               nonZeroIndex++;


            }
        }


        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
