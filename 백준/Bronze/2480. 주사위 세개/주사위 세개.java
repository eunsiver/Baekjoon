import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		if (a == b && b == c)
			System.out.println(10000 + a * 1000);
		else if (a != b && a != c && b != c) {
			max = a > b ? a : b;
			max = max > c ? max : c;
			System.out.println(max * 100);

		} else {
			if (a == b || a == c)
				System.out.println(1000 + a * 100);
			else if (b == c)
				System.out.println(1000 + b * 100);

		}

	}
}
