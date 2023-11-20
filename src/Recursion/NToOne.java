package Recursion;

public class NToOne {

    public static void main(String[] args) {

        int n = 1;

        printN(n,4);
    }

    private static void printN(int n, int i) {

        if(i >= n){
            System.out.println(i);
            printN(n,i-1);
        }
    }
}
