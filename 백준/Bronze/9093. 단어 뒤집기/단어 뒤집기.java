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
		while (n-- > 0) {
			String st = br.readLine() + "\n";
			for (char c : st.toCharArray()) {
				if (c == ' ' || c == '\n') {
					while (!stack.isEmpty()) {
						wr.write(stack.pop());
					}
					wr.write(c);
				} else
					stack.push(c);
			}
		}
		wr.flush();
	}

}