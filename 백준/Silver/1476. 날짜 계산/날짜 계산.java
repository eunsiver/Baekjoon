
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ar = new String[3];
		ar = (br.readLine()).split(" ");
		int year = 0;
		int E = 0, S = 0, M = 0;
		while (true) {
			if (E == Integer.parseInt(ar[0]) && S == Integer.parseInt(ar[1]) && M == Integer.parseInt(ar[2])) {
				System.out.println(year);
				break;
			}
			year++;
			E++;
			S++;
			M++;

			if (E == 16)
				E = 1;
			if (S == 29)
				S = 1;
			if (M == 20)
				M = 1;

		}

	}

}
