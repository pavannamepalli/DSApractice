package Array;

public class MissingNumber {

    public static void main(String[] args) {

        int arr[]= {2,4,1,8,6,3,7};

        int n = arr.length+1;

        int sum = (n*(n+1))/2;

        for(int m : arr){
            sum = sum - m;

        }

        System.out.println("Missing Number is "+sum);
    }
}
