import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchElementException {

		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int a = sc.nextInt();
		System.out.println(a + b);
	}

}