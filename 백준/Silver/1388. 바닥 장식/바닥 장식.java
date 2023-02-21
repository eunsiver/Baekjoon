import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		char[][] a = new char[x][y];
		for (int i = 0; i < x; i++) {
			a[i] = sc.next().toCharArray();
		}
		int c1 = 0, c2 = 0, flag1 = 0, flag2 = 0;
		for (int i = 0; i < x; i++) {
			flag1 = 0;
			for (int j = 0; j < y; j++) {
				if (a[i][j] == '-') {
					if (flag1 == 0)
						c1++;
					flag1 = 1;

				} else if (a[i][j] == '|')
					flag1 = 0;

			}
		}
		for (int i = 0; i < y; i++) {
			flag2 = 0;
			for (int j = 0; j < x; j++) {
				if (a[j][i] == '|') {
					if (flag2 == 0)
						c2++;
					flag2 = 1;

				} else if (a[j][i] == '-')
					flag2 = 0;

			}
		}
		System.out.println(c1 + c2);
	}

}