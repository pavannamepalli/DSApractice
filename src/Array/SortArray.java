package Array;
//Sort an array of 0s, 1s and 2s
public class SortArray {

    public static void main(String[] args) {
        int a[] = {2,0,2,1,1,0};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <  a.length; j++) {
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }

            }

        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
    }
}
