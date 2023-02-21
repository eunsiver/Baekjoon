import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int xnum, ynum;
    static int[][] ar;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        xnum = Integer.parseInt(s[0]);
        ynum = Integer.parseInt(s[1]);
        ar = new int[ynum][xnum];
        for (int i = 0; i < ynum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < xnum; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < ynum; i++) {
            for (int j = 0; j < xnum; j++) {
                if (ar[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }
        bfs();

        int max = 0;
        for (int i = 0; i < ynum; i++) {
            for (int j = 0; j < xnum; j++) {
                if (ar[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, ar[i][j]);
            }
        }
        System.out.println(max - 1);
    }

    static void bfs() {
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};


        // 반복
        //하나를 꺼냄

        int x, y;
        boolean ischange = false;
        while (!q.isEmpty()) {
            int[] o = q.poll();
            for (int i = 0; i < 4; i++) {
                x = o[0] + dx[i];
                y = o[1] + dy[i];
                // 위아래 양옆이 범위를 넘지 않고 0이면 1로 바꿔주고
                //큐에 넣음
                if (x >= 0 && x < ynum && y >= 0 && y < xnum) {
                    if (ar[x][y] == 0) {
                        ar[x][y] = ar[o[0]][o[1]] + 1;
                        q.add(new int[]{x, y});

                    }
                }
            }
        }
    }
}