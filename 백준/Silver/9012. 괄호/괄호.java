import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		String an = "YES\n";
		while (n-- > 0) {
			String st = br.readLine() + "\n";
			for (char ch : st.toCharArray()) {
				if (ch == '\n') {
					if (!stack.isEmpty()) {
						an = "NO\n";
						// wr.write(an);
						stack.clear();
					}

				} else if (ch == ')') {
					if (stack.isEmpty()) {
						an = "NO\n";
						// wr.write(an);
						stack.clear();
						break;

					} else {
						stack.pop();
					}
				} else {
					stack.push(ch);
				}

			}
			wr.write(an);
			an = "YES\n";
		}
		wr.flush();
	}
}
