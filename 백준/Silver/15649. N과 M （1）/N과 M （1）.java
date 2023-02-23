import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,M;
    static int []ar;
    static boolean []visited;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        ar=new int[M];
        visited=new boolean[N];

        dfs(0);
        System.out.println(sb);
    }
    static void dfs(int depth){
        if(depth==M){
            for (int i : ar) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(!visited[i]){
                visited[i]=true;
                ar[depth]=i+1;
                dfs(depth+1);
                visited[i]=false;
            }
        }
    }

}