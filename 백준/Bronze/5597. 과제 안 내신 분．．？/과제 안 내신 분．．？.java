
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder sb = new StringBuilder();
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i = 0;
		int[] ar = new int[31];
		while (i < 28) {
			int c = Integer.parseInt(br.readLine());

			ar[c] = 1;
			i++;
		}
		for (int j = 1; j <= 30; j++) {
			if (ar[j] != 1) {
				System.out.println(j);
			}
		}
	}
}