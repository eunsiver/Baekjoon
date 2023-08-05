
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        Queue<Integer> que=new LinkedList<>();
        que.add(a);
        boolean visited[]=new boolean[1000001];
        visited[a]=true;
        int cnt=0;
        while(!que.isEmpty()){
            cnt++;
            int size= que.size();
            for(int i=0;i<size;i++){
                int k= que.poll();
                if(b==k){
                    System.out.println(cnt-1);
                    return;
                }
                if(b>=k+1&&!visited[k+1]) {
                    que.add(k+1);
                    visited[k+1]=true;
//                    visited[k+1]=visited[k]+1;
                }
                if(b>=k*2&&!visited[k*2]) {
                    que.add(k*2);
                    visited[2*k]=true;
                }

            }
        }
    }
}