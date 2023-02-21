import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] sorted = new int[n];
		int[] origin = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			sorted[i] = Integer.parseInt(st.nextToken());
		}
		origin = sorted.clone();

		Arrays.sort(sorted);

		HashMap<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for (int e : sorted) {
			if (!map.containsKey(e)) {
				map.put(e, idx++);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i : origin) {
			sb.append(map.get(i)).append(" ");
		}
		System.out.println(sb);
	}
}
