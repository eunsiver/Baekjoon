import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] node;
	static boolean[] check;
	static int N;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		node = new int[N + 1][N + 1];
		check = new boolean[N + 1];
		int x = 0, y = 0;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			node[x][y] = node[y][x] = 1;
		}
		int count = 0;

		for (int i = 1; i <= N; i++) {
			
				if (!check[i] ) {
					dfs(i);
					count++;
				}
			
		}
		System.out.print(count);
	}

	private static void dfs(int start) {
		check[start] = true;

		for (int i = 1; i <= N; i++) {
			if (!check[i] && node[start][i] == 1) {
				dfs(i);

			}
		}

	}

}