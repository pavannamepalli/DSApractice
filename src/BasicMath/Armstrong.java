package BasicMath;

public class Armstrong {

    public static void main(String[] args) {

        int N = 153;
        int armstrong = 0;
        int count = 0;
        int temp = N;


        while (temp != 0) {

            temp = temp / 10;
            count++;

        }


        while (N != 0) {
            int digit = N % 10;
            armstrong += Math.pow(digit, count);
            N = N / 10;


        }

        System.out.println(armstrong);
        System.out.println(count);

    }
}
