import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//정렬
//누적합

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println();

		StringBuilder sb = new StringBuilder();

		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] ar = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ar);
		// 1 2 3 3 4
		// 1+3(1+2)+6(1+2+3)+9+13

		// 1+2+3+3+4
		int sum, result;
		sum = result = 0;
		for (int i = 0; i < n; i++) {
			result = 0;
			for (int j = 0; j < i; j++) {
				result += ar[j];
			}
			sum = sum + result + ar[i];
		}
		System.out.println(sum);
	}
}
//