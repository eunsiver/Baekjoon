import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int c = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		TreeSet<Integer> t = new TreeSet<>();
		while (c > 0) {
			t.add(Integer.parseInt(st.nextToken()));
			c--;
		}
		int max = t.last();
		int min = t.first();
		sb.append(min).append(" ").append(max);
		bw.append(sb);
		bw.flush();

	}
}
