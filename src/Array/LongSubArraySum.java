package Array;


// Longest Subarray with given currSum K(Positives)
public class LongSubArraySum {

    public static void main(String[] args) {


        int[] n = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("largest subarray sum : "+maxSubArray(n));




    }

    private static int maxSubArray(int[] n) {

        int maxSum = Integer.MIN_VALUE;
        int start = 0,end = 0;
        for (int i = 0; i < n.length; i++) {
            int  currSum = 0;
            for (int j = i; j < n.length; j++) {
                currSum = currSum+n[j];
                if(currSum >maxSum){
                    maxSum = currSum;
                    start = i;
                    end = j;

                }


            }

        }
        for (int i = start; i <= end; i++) {
            System.out.print(n[i]+ " ");

        }
        return maxSum;
    }
}
