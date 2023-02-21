import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[][] li = new String[n][2];

		for (int i = 0; i < n; i++) {
			li[i][0] = sc.next();
			li[i][1] = sc.next();
		}
		Arrays.sort(li, new Comparator<String[]>() {

			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}

		});
		for (String[] i : li) {
			System.out.println(i[0] + " " + i[1]);
		}
	}
}
