import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String s = br.readLine();
		for (int i = 0; i < alpa.length(); i++) {
			System.out.print(s.indexOf(alpa.charAt(i)) + " ");
		}
	}

}