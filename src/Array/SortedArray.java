package Array;

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] arr = {5,15,1,75,23,47,69,81};
       Arrays.sort(arr);
       //Arrays.binarySearch(arr,1);
        System.out.println(Arrays.binarySearch(arr,1) +" ");

    }
}
