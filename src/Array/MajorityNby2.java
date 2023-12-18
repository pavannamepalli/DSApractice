package Array;

public class MajorityNby2 {

    public static void main(String[] args) {

        int N = 3, nums[] = {3,2,3};

        int ans = majorityElement(nums,N);
        System.out.println(ans);


    }

    private static int majorityElement(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            int cnt =0;
            for (int j = 0; j < nums.length; j++) {


                if (nums[i] == nums[j]){

                    cnt++;
                }

            }
            if (cnt >n/2){
                return nums[i];


            }


        }
        return -1;
    }
}
