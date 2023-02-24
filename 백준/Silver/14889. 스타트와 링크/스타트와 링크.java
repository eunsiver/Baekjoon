import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int N,min=Integer.MAX_VALUE;
    static int [][]ar;
    static boolean []visit;
    public static void main(String[] args) throws IOException {


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        ar=new int[N][N];
        visit=new boolean[N];
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                ar[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        combi(0,0);
        System.out.println(min);
    }
    static void combi(int idx, int count){
        //중복없이
        //base condition
        if(count==N/2){
            diff();
            return;
        }
        //백트래킹
        for(int i=idx;i<N;i++){
            if(!visit[i]){
                visit[i]=true;
                combi(i+1,count+1);
                visit[i]=false;
            }
        }

    }
    static void diff(){
        int team_start=0;
        int team_link=0;

        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(visit[i]&&visit[j]){
                    team_start+=ar[i][j];
                    team_start+=ar[j][i];
                }
                else if(!visit[i]&&!visit[j]){
                    team_link+=ar[i][j];
                    team_link+=ar[j][i];
                }
            }
        }
        int val=Math.abs(team_start-team_link);

        /*
        두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에
        더 이상의 탐색 필요없이 0을 출력하고 종료
        */
        if(val==0){
            System.out.println(val);
            System.exit(0);
        }
        min=Math.min(val,min);

    }
}