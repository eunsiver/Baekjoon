
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		int c = 0, flag = 0;

		for (int test_case = 1; test_case <= T; test_case++) {
			flag = 0;
			int n = sc.nextInt();// n
			if (n != 1) {
				for (int i = 2; i <=Math.sqrt(n); i++) {
					if (n == i)
						continue;
					if (n % i == 0) {
						flag = 1;
					}
				}
				if (flag != 1) {
					c++;
				}
			}
		}
		System.out.print(c);
	}

}