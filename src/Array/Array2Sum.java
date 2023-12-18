package Array;


//Two Sum : Check if a pair with given sum exists in Array
public class Array2Sum {

    public static void main(String[] args) {

        int a[]= {2,6,5,8,11};
        int k = 14;

        for (int i = 0; i <a.length; i++) {
            for (int j = i; j <a.length; j++) {
                if(a[i]+a[j] == k) {
                    System.out.println("yes " + a[i]+" "+ a[j]);
                }

            }

        }
    }


}
