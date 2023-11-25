package Array;

import java.util.ArrayList;


// Longest Subarray with given Sum K(Positives)
public class LongSubArraySum {

    public static void main(String[] args) {


        int[] a = {-2, 1, 1};
        int k = 0;

        // Creating ArrayList
        ArrayList<Integer> clist = new ArrayList<>();

        // adding elements of array
        // to ArrayList
        for (int i : a)
            clist.add(i);

        int sum = 0;
        for (int i :a) {
            sum = sum + i;
            if(sum == k){
                for (int j =0;j<= clist.indexOf(i);j++){
                    System.out.print(a[j]+" ");
                }
                break;
            }


        }
    }
}
