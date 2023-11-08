package BasicMath;

public class NumberReverse {

    public static void main(String[] args) {

        int N = 12345;
        int reverseN=0;

        while (N!=0){
            int n = N%10;
            reverseN = reverseN*10+n;
            N=N/10;

        }
        System.out.println(reverseN);
    }
}
