import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a[] = (br.readLine().split(" "));
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);

		int nn1 = 0, nn2 = 0, i = 1, j = 1;
		while (n1 != 0) {
			nn1 = nn1 * 10 + n1 % 10;
			n1 = n1 / 10;

		}

		while (n2 != 0) {
			nn2 = nn2 * 10 + n2 % 10;
			n2 = n2 / 10;

		}

		int max = nn1 > nn2 ? nn1 : nn2;
		System.out.println(max);
	}

}