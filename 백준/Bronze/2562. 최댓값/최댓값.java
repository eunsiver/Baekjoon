
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine());

		int in = 1;
		int re = 1;
		int max = Integer.MIN_VALUE;
		int i = 9;
		while (i > 0) {
			int cs = Integer.parseInt(br.readLine());
			if (max < cs) {
				max = cs;
				re = in;

			}
			in++;
			i--;
		}
		System.out.printf("%d\n%d", max, re);
	}
}
