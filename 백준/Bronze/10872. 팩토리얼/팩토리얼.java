import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println();

		StringBuilder sb = new StringBuilder();
		String read = br.readLine();
		int n = Integer.parseInt(read);
		System.out.println(re(n));

		// StringTokenizer st = new StringTokenizer(read, "-");

	}

	public static int re(int n) {

		if (n == 0)
			return 1;
		else
			return n * re(--n);

	}
}
//