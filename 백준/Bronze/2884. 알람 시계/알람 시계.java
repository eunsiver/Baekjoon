import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b < 45) {
			if (a == 0) {
				System.out.print("23 ");
			} else {
				System.out.printf("%d ", a - 1);
			}
			System.out.print(b - 45 + 60);
		} else {
			System.out.printf("%d %d", a, b - 45);
		}

	}
}