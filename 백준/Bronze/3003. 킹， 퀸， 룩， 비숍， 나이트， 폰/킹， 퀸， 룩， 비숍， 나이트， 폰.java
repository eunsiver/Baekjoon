import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException {

		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ar = { 1, 1, 2, 2, 2, 8 };
		int i = 0;
		while (i < 6) {

			int a = Integer.parseInt(st.nextToken());
			System.out.print(ar[i] - a + " ");
			i++;
		}
	}
}
