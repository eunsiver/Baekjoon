
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans[] = new long[n];

        for( int i = 0 ; i < n ; i++ ) {
            int k = sc.nextInt();

            long ar[] = new long[k];
            long max = 0;

            for( int j = 0 ; j < k ; j++ ) {
                ar[j] = sc.nextInt();
            }

            for( int j = k-1 ; j >= 0 ; j-- ) {
                if(ar[j] > max) {
                    max = ar[j];
                }else {
                    ans[i] += (max - ar[j]);
                }
            }
        }
        for( long i : ans) {
            System.out.println(i);
        }
    }

}
