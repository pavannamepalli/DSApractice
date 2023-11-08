package BasicMath;

public class Palindrome {

    public static void main(String[] args) {

        int N = 12345;
        int actualNumner = N;
        int reverseN=0;

        while (N!=0){
            int n = N%10;
            reverseN = reverseN*10+n;
            N=N/10;

        }
       if(actualNumner == reverseN){
           System.out.println("palindrome");
       }else {
           System.out.println("not palindrome");
       }
    }
}
