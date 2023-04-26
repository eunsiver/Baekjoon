import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static final int dx[] = {0, 1, 0, -1};
    static final int dy[] = {1, 0, -1, 0};
    static char[][] map;
    static boolean[][] visit;
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        visit = new boolean[n][n];
        String s;

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        //System.out.println(Arrays.deepToString(map));

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'R' && !visit[i][j]) {
                    dfs('R', 'R', i, j);
                    count++;
                } else if (map[i][j] == 'G' && !visit[i][j]) {
                    dfs('G', 'G', i, j);
                    count++;
                } else if (map[i][j] == 'B' && !visit[i][j]) {
                    dfs('B', 'B', i, j);
                    count++;
                }
            }
        }
        System.out.print(count+" ");

        visit = new boolean[n][n];
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((map[i][j] == 'R' || map[i][j] == 'G') && !visit[i][j]) {
                    dfs('R', 'G', i, j);
                    count++;
                } else if (map[i][j] == 'B' && !visit[i][j]) {
                    dfs('B', 'B', i, j);
                    count++;
                }
            }
        }
        System.out.println(count);


    }

    public static void dfs(char one, char two, int y, int x) {

        visit[y][x] = true;

        int newX, newY;
        for (int i = 0; i < 4; i++) {
            newX = x + dx[i];
            newY = y + dy[i];

            if (newX < 0 || newY < 0 || newX > n - 1 || newY > n - 1) {
                continue;
            }
            if (!visit[newY][newX] && (map[newY][newX] == one || map[newY][newX] == two)) {
                dfs(one, two, newY, newX);
            }
        }
    }
}
