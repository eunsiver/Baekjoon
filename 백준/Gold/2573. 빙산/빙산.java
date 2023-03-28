import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int count = 0;

    static int totalCount=0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] != 0)
                        melt(i, j);
                }
            }
            //다 녹았는지 확인하여 다 녹았으면 0을 출력한다.
            if (isAllZero()) {
                System.out.println(0);
                return;
            }
            visited = new boolean[N][M];
            totalCount++;

            count=0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(!visited[i][j]&&map[i][j]!=0){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            //두 덩어리 이상으로 분리되는 최초의 시간
            if (count >= 2) {
                System.out.println(totalCount);
                return;
            }


        }
    }
    public static void dfs(int y,int x){
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < 4; i++) {
            int Y = y + dy[i];
            int X = x + dx[i];

            if(X<0||Y<0||X>M-1||Y>N-1)continue;

            if (map[Y][X] != 0 && !visited[Y][X]) {
                visited[Y][X]=true;
                dfs(Y,X);
            }
        }
    }

    public static void melt(int y, int x) {
        int zeroCheck = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        visited[y][x]=true;

        for (int i = 0; i < 4; i++) {
            int Y = y + dy[i];
            int X = x + dx[i];

            if(X<0||Y<0||X>M-1||Y>N-1)continue;

            if (map[Y][X] == 0&&!visited[Y][X]) {
                zeroCheck++;
            }
        }
        map[y][x] -= zeroCheck;
        if (map[y][x] < 0) map[y][x] = 0;
    }

    public static boolean isAllZero() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
