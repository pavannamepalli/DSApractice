package Array;

public class LinearArraySearch {

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5}, num = 5;

        for (int i:arr) {
            if(arr[i] == num){
                System.out.println("element is fount at "+i);
                break;
            }

        }
    }
}
