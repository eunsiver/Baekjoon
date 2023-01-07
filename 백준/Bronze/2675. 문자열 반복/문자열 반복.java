import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				for (int m = 0; m < k; m++) {
					sb.append(c);
				}

			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
