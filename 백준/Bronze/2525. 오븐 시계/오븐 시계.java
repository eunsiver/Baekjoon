import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int plus = (b + c) / 60;
		if (a + plus == 24)
			System.out.print("0 ");
		else if (a + plus > 24)
			System.out.printf("%d ", (a + plus) % 24);
		else
			System.out.printf("%d ", a + plus);
		System.out.println((b + c) % 60);

	}
}