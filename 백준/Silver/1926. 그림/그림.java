import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m, count = 0, maxNum = Integer.MIN_VALUE,sum=0;
    static int[][] image;            // 도화지 배열
    static boolean[][] visited;            // 방문처리 배열
    static int []dx={0,1,0,-1};
    static int []dy={1,0,-1,0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        image = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                image[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && image[i][j] == 1) {
                    dfs(i,j);
                    maxNum= maxNum<sum? sum: maxNum;
                    sum=0;
                    count++;
                }
            }
        }

        System.out.println(count);
        if(count==0){
            System.out.println(0);
            return;
        }
        System.out.println(maxNum+1);
    }
    public static void dfs(int y, int x){

        visited[y][x]=true;

        for(int i=0;i<4;i++){
            int newX=x+dx[i];
            int newY=y+dy[i];

            if(newX<0||newY<0||newX>=m||newY>=n) continue;
            if(!visited[newY][newX]&&image[newY][newX]==1){
                dfs(newY, newX);
                sum++;
            }
        }
    }
}
