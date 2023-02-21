import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		char c[] = br.readLine().toCharArray();
		int co = 0;
		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			if (ch == 'A' || ch == 'B' || ch == 'C') {
				co += 3;
			} else if (ch == 'D' || ch == 'E' || ch == 'F') {
				co += 4;
			} else if (ch == 'G' || ch == 'H' || ch == 'I') {
				co += 5;
			} else if (ch == 'J' || ch == 'K' || ch == 'L') {
				co += 6;
			} else if (ch == 'M' || ch == 'N' || ch == 'O') {
				co += 7;
			} else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
				co += 8;
			} else if (ch == 'T' || ch == 'U' || ch == 'V') {
				co += 9;
			} else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
				co += 10;
			}

		}
		System.out.print(co);

	}
}
