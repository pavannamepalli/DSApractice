package Array;

//public class MaxConsectOne {
//
//    public static void main(String[] args) {
//
//        int arr[] = {1, 1, 0, 1, 1, 1};
//
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 1; j < arr.length; j++) {
//
//                if (arr[i] == arr[j]){
//                    count++;
//                }else {
//                    break;
//                }
//
//            }
//            System.out.println(count);
//
//        }
//
//
//
//    }
//
//}

public class MaxConsectOne {
    static int findMaxConsecutiveOnes(int nums[]) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
    public static void main(String args[]) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}
