import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node {

    int x, y;

    Node(int y, int x) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static char map[][];
    static int newMap1[][];
    static int newMap2[][];
    static int x, y;
    static Queue<Node> q1 = new LinkedList<>();
    static Queue<Node> q2 = new LinkedList<>();
    static int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        init();
        //먼저 불이 난 공간 체크
        checkFire();
        //J가 갈 수 있는 곳 중 가장 빠른 탈출 시간체크
        goJ();

    }

    public static void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        String s;
        char c;
        map = new char[y][x];
        newMap1 = new int[y][x];
        newMap2 = new int[y][x];

        for (int[] i : newMap1) Arrays.fill(i, -1);
        for (int[] i : newMap2) Arrays.fill(i, -1);

        for (int i = 0; i < y; i++) {
            s = br.readLine();
            for (int j = 0; j < x; j++) {

                c = s.charAt(j);
                if (c == 'F') {
                    q1.offer(new Node(i, j));
                    newMap1[i][j] = 0;
                }
                if (c == 'J') {
                    q2.offer(new Node(i, j));
                    newMap2[i][j] = 0;
                }
                map[i][j] = c;
            }
        }
//        for (Node n: q1) {
//            System.out.println(n.y+" "+n.x);
//        }
//        System.out.println(Arrays.deepToString(map));
    }

    public static void goJ() {
        int newX, newY;

        while (!q2.isEmpty()) {

            Node node = q2.poll();

            for (int i = 0; i < 4; i++) {
                newX = dx[i] + node.x;
                newY = dy[i] + node.y;


                if (newY < 0 || newX < 0 || newX >= x || newY >= y) //범위를 벗어났다는 것은 탈출에 성공했다는 의미
                {
                    System.out.println(newMap2[node.y][node.x] + 1);
                    return;
                }

                if (newMap2[newY][newX] >= 0 || map[newY][newX] == '#') continue;
                //불보다 작으면 갈 수 있어
                if (newMap1[newY][newX] <= newMap2[node.y][node.x]+1 && newMap1[newY][newX] != -1) continue;

                newMap2[newY][newX] = newMap2[node.y][node.x] + 1;
                q2.offer(new Node(newY, newX));

            }
        }

        System.out.println("IMPOSSIBLE");
    }

    public static void checkFire() {

        int newX, newY;

        while (!q1.isEmpty()) {

            Node node = q1.poll();

            for (int i = 0; i < 4; i++) {
                newX = dx[i] + node.x;
                newY = dy[i] + node.y;

                if (newY < 0 || newX < 0 || newX >= x || newY >= y) continue;
                if (newMap1[newY][newX] >= 0 || map[newY][newX] == '#') continue;

                newMap1[newY][newX] = newMap1[node.y][node.x] + 1;
                q1.offer(new Node(newY, newX));

            }
        }
        //System.out.println(Arrays.deepToString(newMap1));
    }
}
/*
[[0, 0, 0, 0]
 [0, 0, 1, 0]
 [0, 3, 2, 0]
 [0, 4, 3, 0]]

 4 4
####
#JF#
#..#
####
*/

