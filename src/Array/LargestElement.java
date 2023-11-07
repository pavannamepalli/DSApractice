package Array;

import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {5,15,1,75,23,471,69,871};

        int max = arr[0];

        Arrays.sort(arr);
        System.out.println("Second Largest Element :"+arr[arr.length-2]);


        for (int i = 1; i <arr.length ; i++) {
            if(max<arr[i]){
                max = arr[i];
            }


        }
        System.out.println("largest Element :"+max);

        }
    }

