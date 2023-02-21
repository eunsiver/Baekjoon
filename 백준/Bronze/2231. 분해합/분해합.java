import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		// 입력 256 출력 245
		// 입력 216 출력 198
		int sum = 0, min = Integer.MAX_VALUE;
		boolean has = false;
		for (int i = n - 1; i > 0; i--) {
			int m = i;
			sum = 0;
			while (m > 0) {
				sum += m % 10;
				m /= 10;
			}
			if (i + sum == n) {
				min = Math.min(i, min);
				has = true;
			}
		}
		if (has) {
			System.out.println(min);
		} else {
			System.out.println(0);
		}
	}
}
