import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int check = Integer.parseInt(br.readLine());

        Arrays.sort(a);
        
        int left = 0, right = n - 1, count = 0;

        while (left < right) {

            int k = a[left] + a[right];

            if (k == check) {
                count++;
                left++;
                right--;
            } else if (k > check) {
                right--;
            } else left++;
        }

        System.out.println(count);
    }
}
