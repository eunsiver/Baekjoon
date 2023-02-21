import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println();
		// StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] ar = new String[n];
		for (int i = 0; i < n; i++) {
			ar[i] = (br.readLine());
		}
		ar = Arrays.stream(ar).distinct().toArray(String[]::new);
		Arrays.sort(ar, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length())
					return -1;
				else if (o1.length() > o2.length())
					return 1;
				else
					return o1.compareTo(o2);
			}

		});

		for (String i : ar) {
			sb.append(i).append("\n");

		}
		System.out.println(sb);
	}
}
