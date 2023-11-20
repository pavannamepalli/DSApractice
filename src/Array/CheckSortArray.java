package Array;

import java.util.Arrays;

public class CheckSortArray {

    public static void main(String[] args) {

        int[] arr = {22,31,5,10,0,8};
        boolean sorted = false;
        int i = 0;

        while ( i < arr.length && i+1 < arr.length){
            if(arr[i] < arr[i+1]){
                sorted = true;
                i++;
            }else{
                sorted = false;
                break ;
            }
        }
        if (sorted) {
            System.out.println("sorted array");
        }else {
            System.out.println("not a sorted array");
        }
    }
}
