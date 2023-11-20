package Recursion;

public class SumOfN {

    public static void main(String[] args) {
        int n = 10;
       int total= sumOfN(n);
       int factorialTOtal = fact(5);

       System.out.println(total);
       System.out.println(factorialTOtal);
    }

    private static int fact(int n) {

        if(n==1){
            return 1;
        }else {
            return n * fact(n-1);
        }

    }

    private static int sumOfN(int n) {
            if(n==0){
                   return 0;
                }else {
                    return n + sumOfN(n-1);
                }

    }
}
