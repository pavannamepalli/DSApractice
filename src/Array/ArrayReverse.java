package Array;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {2,11,5,10,0,8};
        int[]  rev = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            rev[i]=arr[arr.length-1-i];
        }

        for(int i =0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }



    }
}
