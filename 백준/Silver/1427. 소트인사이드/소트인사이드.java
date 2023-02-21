import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println();

		StringBuilder sb = new StringBuilder();
		String read = br.readLine();
		String[] s = read.split("");
		Integer[] ar = Stream.of(s).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		Arrays.sort(ar, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}

		});
		for (int i : ar) {
			System.out.print(i);
		}
	}
}
//