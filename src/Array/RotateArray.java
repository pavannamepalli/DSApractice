package Array;


// Left Rotate the Array by One
public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int temp = arr[0];

        for(int i = 0 ;i<=arr.length-1;i++){
            if(i != arr.length-1)
            {
                arr[i]=arr[i+1];
            }else {
                arr[i]= temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
