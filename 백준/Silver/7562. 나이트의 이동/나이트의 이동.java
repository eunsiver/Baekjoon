import java.io.*;
import java.util.*;

public class Main {


    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    static Queue<int []> que;
    static boolean visited[][];
    static int[][]ar;
    static int a1, a2, b1, b2,k;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            k = Integer.parseInt(br.readLine());
            que = new LinkedList<>();
            visited = new boolean[k][k];
            ar=new int[k][k];

            st = new StringTokenizer(br.readLine());
            a1 = Integer.parseInt(st.nextToken());
            a2 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            b1 = Integer.parseInt(st.nextToken());
            b2 = Integer.parseInt(st.nextToken());

            BFS();
            System.out.println(ar[b1][b2]);
        }


    }

    static void BFS() {
        que.offer(new int[]{a1,a2});
        visited[a1][a2]=true;

        while (!que.isEmpty()) {
            int now[] = que.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i=0;i<8;i++){
                int newX= nowX+dx[i];
                int newY= nowY+dy[i];

                if(newX<0||newX>=k||newY<0||newY>=k) continue;
                if(visited[newX][newY])continue;

                visited[newX][newY]=true;
                ar[newX][newY]=ar[nowX][nowY]+1;

                if(newX==b1&&newY==b2)break;
                que.offer(new int[]{newX,newY});

            }
        }
    }
}