package Recursion;

// Print one to N using Recursion
public class OneToN {

    public static void main(String[] args) {

        int n = 4,i=1;

        printN(n,1);

    }

    private static void printN(int n, int i) {

        if(i<=n){
            System.out.println(i);
            printN(n, i+1);
        }
    }
}
