import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int array[] = new int[9];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n, k;

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			que.add(i);
		}

		sb.append("<");

		while (que.size() != 1) {
			for (int i = 0; i < k - 1; i++) {
				que.add(que.poll());
			}
			sb.append(que.poll() + ", ");
		}
		sb.append(que.poll());
		sb.append(">");

		bw.write(sb.toString());
		bw.flush();
	}
}