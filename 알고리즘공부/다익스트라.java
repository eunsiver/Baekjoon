import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    private int index;
    private int distance;

    Node(int index, int distance){
        this.index=index;
        this.distance=distance;
    }
    public int getIndex(){
        return this.index;
    }
    public int getDistance(){
        return this.distance;
    }

    //거리가 짧은 것이 높은 우선순위를 가지도록
    @Override
    public int compareTo(Node other){
        if(this.distance< other.distance){
            return -1;
        }
        return 1;
    }
}
public class Main {

    public static final int INF=(int)1e9;
    public static int n,m, start;
    public static ArrayList<ArrayList<Node>>graph=new ArrayList<ArrayList<Node>>();

    //최단거리 테이블 만들기, 노드의 개수는 최대 100,000개라고 가정
    public static int[]d=new int[100001];

    public static void dijkstra(int start){

        PriorityQueue<Node> pq=new PriorityQueue<>();

        pq.offer(new Node(start,0));

        d[start]=0;

        while(!pq.isEmpty()){
            //가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
            Node node=pq.poll();
            int dist= node.getDistance();
            int now=node.getIndex();

            //현재 노드가 이미 처리 된 적 있는 노드라면 무시
            if(d[now]<dist) continue;
            //현재 노드와 연결된 다른 인접한 노드들을 확인
            for(int i=0;i<graph.get(now).size();i++){
                int cost=d[now]+graph.get(now).get(i).getDistance();
                if(cost<d[graph.get(now).get(i).getIndex()]){
                    d[graph.get(now).get(i).getIndex()]=cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(),cost));
                }
            }
        }
    }

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        //그래프 초기화
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        //모든 간선 정보를 입력 받기
        for(int i=0; i<m;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            //a번의 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b,c));
        }

        //최단 거리 테이블을 모두 무한으로 초기화
        Arrays.fill(d,INF);

        dijkstra(start);

        //모든 노드로 가기 위한 최단 거리를 출력
        for(int i=1;i<=n;i++){
            
            //도달할 수 없는 경우, 무한이라고 출력
            if(d[i]==INF){
                System.out.println("INFINITY");
            }
            //도달할 수 있는 경우 거리를 출력
            else System.out.println(d[i]);
        }
    }
}
