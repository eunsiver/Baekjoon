import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int c = 1;
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		while (n > 0) {
			sum = 0;
			c = 1;
			String s = br.readLine();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'O') {
					sum += c;
					c++;
				} else {
					c = 1;
				}
			}
			n--;
			System.out.println(sum);
		}

	}
}