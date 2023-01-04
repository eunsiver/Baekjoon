import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int c = Integer.parseInt(br.readLine());
		int newc = c;
		int sum = 0;
		int count = 0;
		do {
			sum = 0;
			int a = newc / 10;
			int b = newc % 10;
			sum = a + b;
			newc = b * 10 + sum % 10;

			count++;
		} while (newc != c);
		System.out.println(count);
	}
}