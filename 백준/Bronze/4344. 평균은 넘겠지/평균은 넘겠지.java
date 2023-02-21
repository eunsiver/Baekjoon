import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] ar = null;
		double sum = 0;
		while (n > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			ar = new int[num];
			for (int j = 0; j < num; j++) {
				int a = Integer.parseInt(st.nextToken());

				ar[j] = a;
				sum += a;
			}
			double avg = sum / num;
			int c = 0;
			for (int j = 0; j < num; j++) {
				if (avg < ar[j]) {
					c++;
				}
			}
			System.out.print(String.format("%.3f", (double) c / num * 100));
			System.out.print("%\n");
			sum = 0;
			c = 0;
			n--;
		}
	}
}