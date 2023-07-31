import java.io.*;
import java.util.*;


public class Main {

    static int[][] ar;
    static int Y, X;
    static int[] visit = new int[100001];
    static Queue<Integer> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        System.out.println(bfs(X, Y));
    }

    public static int bfs(int x, int y) {

        que.offer(x);
        visit[x] = 1;
        while (!que.isEmpty()) {
            int k = que.poll();

            if (k == y) {
                return visit[k] - 1;
            } if (k - 1 >= 0 && visit[k - 1] == 0) {
                visit[k - 1] = visit[k] + 1;
                que.offer(k - 1);
            }  if (k + 1 <= 100000 && visit[k + 1] == 0) {
                visit[k + 1] = visit[k] + 1;
                que.offer(k + 1);
            }  if (2 * k <= 100000 && visit[k * 2] == 0) {
                visit[2 * k] = visit[k] + 1;
                que.offer(2 * k);
            }


        }
        return -1;
    }
}