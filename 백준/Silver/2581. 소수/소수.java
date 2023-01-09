import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int c = 0, flag = 0;
		int ind = 0, min = Integer.MAX_VALUE;
		for (int i = a; i <= b; i++) {
			if (i == 1)
				continue;
			flag = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i == j)
					continue;
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				c += i;
				if (c < min)
					min = c;
			}
		}
		if (c == 0) {
			System.out.println(-1);
		} else {
			System.out.println(c);
			System.out.print(min);
		}

	}

}