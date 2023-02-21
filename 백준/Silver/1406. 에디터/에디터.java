
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		Stack<Character> stack = new Stack<>();
		StringBuilder rr = new StringBuilder();
		for (int i = 0; i < st.length(); i++) {
			stack.push(st.charAt(i));
		}
		int n = Integer.parseInt(br.readLine());

		while (n-- > 0) {
			StringTokenizer to = new StringTokenizer(br.readLine());
			String ts = to.nextToken();

			if (ts.equals("P")) {
				char e = (to.nextToken()).charAt(0);
				stack.push(e);
			} else if (ts.equals("B")) {
				if (stack.isEmpty()) {
					continue;
				} else
					stack.pop();

			} else if (ts.equals("L")) {
				if (stack.isEmpty()) {
					continue;
				} else
					rr.append(stack.pop().toString());

			} else if (ts.equals("D")) {
				if (rr.length() == 0) {
					continue;
				}

				else {

					char ra = rr.charAt(rr.length() - 1);
					stack.push(ra);
					rr.deleteCharAt(rr.length() - 1);
				}

			}
		}
		while (!stack.isEmpty()) {
			rr.append(stack.pop());
		}

		wr.write(rr.reverse().toString());
		wr.flush();

	}
}