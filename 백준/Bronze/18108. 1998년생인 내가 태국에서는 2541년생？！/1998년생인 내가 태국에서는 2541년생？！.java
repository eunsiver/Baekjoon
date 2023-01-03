import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException {

		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		System.out.print(s - 543);
	}
}

//2562 2019 2541 1998