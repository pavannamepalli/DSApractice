package Array;


// Find the number that appears once
public class AppearOne {

    public static void main(String[] args) {

        int arr[] = {4,4,4,5,1,2,1,2};

        int k = uniqueValue(arr);
        System.out.println("unique ELement "+k);

    }

    private static int uniqueValue(int[] arr) {

        for(int i =0;i<arr.length;i++){
           int temp = arr[i];
           int count = 0;

           for(int j =0;j<arr.length;j++){

               if(arr[j] ==  temp){
                   count++;
               }
           }
           if (count == 1){
               return arr[i];
           }

        }
        return -1;
    }
}
