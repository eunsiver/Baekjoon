import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    static int nodeNum=0;
    static boolean []visited;
    static int [][]node;
    static StringBuilder sb=new StringBuilder();

    public static void main(String [] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        nodeNum=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        int first= Integer.parseInt(st.nextToken());

        node=new int[nodeNum+1][nodeNum+1];
        visited=new boolean[nodeNum+1];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            node[a][b]=node[b][a]=1;
        }

        dfs(first);

        sb.append("\n");
        visited=new boolean[nodeNum+1];

        bfs(first);

        System.out.println(sb);
    }

    public static void dfs(int first){
        visited[first]=true;
        sb.append(first).append(" ");

        for(int i=0;i<=nodeNum;i++){
            if(!visited[i]&&node[first][i]==1){
                dfs(i);
            }
        }
    }

    public static void bfs(int first){
        Queue<Integer> q=new LinkedList<>();

        q.offer(first);
        visited[first]=true;

        while(!q.isEmpty()){
           int k= q.poll();
           sb.append(k).append(" ");

           for(int i=0;i<=nodeNum;i++){
               if(!visited[i]&&node[k][i]==1){
                   q.offer(i);
                   visited[i]=true;
               }
           }
        }


    }
}
