import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] team = new int[7][2];

        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int capacity = Integer.parseInt(s[1]);
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            team[b][a]++;
        }
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum += team[i][0] / capacity + team[i][0] % capacity;
            sum += team[i][1] / capacity + team[i][1] % capacity;
        }
        //System.out.println(Arrays.deepToString(team));
        System.out.println(sum);
    }
}
