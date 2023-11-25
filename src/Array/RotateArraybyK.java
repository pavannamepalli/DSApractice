package Array;

public class RotateArraybyK {

    public static void main(String[] args) {

//        int a[] = {1,2,3,4,5,6,7};
//
//        int b[] = new int[a.length];
//        System.arraycopy(a, 0, b, 0, a.length);
//
//        for (int i = 0; i < a.length; i++) {
//            if (i+2 <  a.length) {
//                a[i] = a[i + 2];
//            }else {
//                a[i]=b[a.length-i-2];
//            }
//
//        }
//        for (int j =0;j< a.length;j++){
//            System.out.print(a[j]+" ");
//        }

        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2; // Number of positions to rotate

        int n = a.length;

        int b[] = new int[n];
        System.arraycopy(a, 0, b, 0, n);

        for (int i = 0; i < n; i++) {
            if (i < k) {
                a[i] = b[n - k + i];
            } else {
                a[i] = b[i - k];
            }
        }

        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");
        }


    }
}
