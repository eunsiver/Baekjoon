import java.io.IOException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		boolean[] ar = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int k = i;
			int check = i;
			while (check > 0) {
				k += check % 10;
				check = check / 10;
			}
			if (k < 10001) {
				ar[k] = true;
			}
		}
		for (int j = 1; j < ar.length; j++) {
			if (!ar[j])
				System.out.println(j);
		}
		;
		return;

	}

}
