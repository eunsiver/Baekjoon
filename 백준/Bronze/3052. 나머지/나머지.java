import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder sb = new StringBuilder();
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i = 10;
		TreeSet<Integer> t = new TreeSet<>();
		while (i > 0) {
			t.add(Integer.parseInt(br.readLine()) % 42);
			i--;
		}
		System.out.print(t.size());
	}
}
