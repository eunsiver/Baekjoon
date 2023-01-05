import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int c = Integer.parseInt(br.readLine());
		ArrayList<Integer> ar = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (c-- != 0) {
			ar.add(Integer.parseInt(st.nextToken()));
		}
		int check = Integer.parseInt(br.readLine());
		int cs = Collections.frequency(ar, check);

		System.out.println(cs);
	}
}
