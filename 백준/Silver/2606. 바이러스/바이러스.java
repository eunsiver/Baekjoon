import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] a;
	static boolean check[];
	static int node, n, c = 0;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		node = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());

		a = new int[node + 1][node + 1];
		check = new boolean[node + 1];
		int x, y;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			a[x][y] = a[y][x] = 1;
		}

		System.out.println(dfs(1));
	}

	public static int dfs(int start) {
		check[start] = true;

		for (int i = 1; i <= node; i++) {
			if (!check[i] && a[start][i] == 1) {
				dfs(i);
				c++;
			}
		}

		return c;
	}
}
