import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = 0;
		while (num-- > 0) {

			String s = sc.next();
			c += check(s);

		}
		System.out.println(c);
	}

	public static int check(String s) {
		int isTrue = 1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int first = s.indexOf(ch);
			int last = s.lastIndexOf(ch);
			if (first == last) {
				continue;
			} else if (last - first > 1) {
				for (int j = first; j <= last; j++) {
					if (s.charAt(j) != ch) {
						isTrue = 0;
						return isTrue;
					}

				}
			}
		}
		return isTrue;

	}

}