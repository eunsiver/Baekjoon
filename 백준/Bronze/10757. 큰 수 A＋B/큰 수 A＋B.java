import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());

		a = a.add(b);
		System.out.println(a);
	}

}
