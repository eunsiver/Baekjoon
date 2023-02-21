
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//-뒤에서 괄호( 생성
//다음 -오기전, 끝에서 )생성
//55-(50+40)
//55-(50+40
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println();

		StringBuilder sb = new StringBuilder();
		String read = br.readLine();
		StringTokenizer st = new StringTokenizer(read, "-");
		List<String> s = Arrays.asList(read.split(""));
		int i = 0, sum = 0, countToken = st.countTokens();

		String[] ar = new String[countToken];
		String innerString[];

		while (st.hasMoreTokens()) {

			ar[i++] = (st.nextToken());
		}
		for (int k = 0; k < countToken; k++) {
			if (ar[k].contains("+")) {

				innerString = (ar[k].split("\\+"));
				sum = 0;

				for (int j = 0; j < innerString.length; j++) {

					sum += Integer.parseInt(innerString[j]);
				}

				ar[k] = String.valueOf(sum);
			}
		}
		int result = Integer.parseInt(ar[0]);
		for (int k = 1; k < ar.length; k++) {
			result -= Integer.parseInt(ar[k]);
		}
		System.out.println(result);
	}
}