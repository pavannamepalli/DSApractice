package Recursion;

public class FibnacciSeries {

    public static void main(String[] args) {
        int n = 5;

     // System.out.println(fibonacci(n)+"");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    private static int  fibonacci(int N) {

       if(N<=1){
        return  N  ;
       }
        return fibonacci(N-1)+ fibonacci(N-2);

//        if(N <= 1){
//
//            return N;
//        }
//
//        // Problem broken down into 2 functional calls
//        // and their results combined and returned.
//        int last = fibonacci(N-1);
//        int slast = fibonacci(N-2);
//
//        return last + slast;

    }
}
