
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean visited[][];
    static int arr[][];
    static int N;
    static int count=0,c=0;
    static int dy[]={1,0,-1,0};
    static int dx[]={0,1,0,-1};
    public static void main(String[] args) throws IOException {
        //for문으로 전체적으로 탐색
        //그 안에서 count 증가 후 출력
        //for문에서 count++;
        //dfs안에서 c++;

        //방문 조건 없어도 됨
        //배열 안에서 숫자 증가할 것임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<N;i++){
            String s= br.readLine();
            for(int j=0; j<N; j++) {
                arr[i][j]= Character.getNumericValue(s.charAt(j));
            }
        }

        List<Integer> li=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){

                if(!visited[i][j]&&arr[i][j]==1) {
                    dfs(i,j);
                    li.add(c);
                    count++;//총 몇개의 단지가 있는지
                    c=0;
                }
            }
        }
        System.out.println(count);
        li.stream().sorted().forEach(i-> System.out.println(i));
    }
    private static void dfs(int x, int y){

        visited[x][y]=true;
        c++;

        for(int i=0;i<4;i++){
            //범위체크
            int newX=x+dx[i];
            int newY=y+dy[i];
            if(newX<0|| newX>=N|| newY<0||newY>=N)continue;
            if(visited[newX][newY])continue;
            if(arr[newX][newY]==0)continue;
            //방문했다면 넘어가기

            dfs(newX,newY);
        }
    }
}
