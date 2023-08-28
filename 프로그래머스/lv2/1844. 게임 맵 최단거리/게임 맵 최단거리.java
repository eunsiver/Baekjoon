import java.util.*;

class Solution {
    
    static int N,M;
    static int [][] map;
    
    static class Node{
        int x,y;
        
        Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    
    static int dx[]={0,1,0,-1};
    static int dy[]={1,0,-1,0};
    
    public int solution(int[][] maps) {
        
        N=maps.length;
        M=maps[0].length;
        map= maps;
        
        bfs(0,0);
        int k=(map[N-1][M-1]);
       // System.out.println(Arrays.deepToString(map));
        if(k==1)k=-1;
        int answer = k;
        return answer;
    }
    
    public void bfs(int x, int y){
        
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(x,y));
        
        while(!que.isEmpty()){
       
            Node now = que.poll();
            
            for(int i=0;i<4;i++){
                int newX = now.x + dx[i];
                int newY = now.y + dy[i];
                
                if(newX<0||newX>=N||newY<0|| newY>=M)continue;
                //1인 경우에만 가기
                if(map[newX][newY]==1){
                    //System.out.println(newX+"," + newY);
                    que.offer(new Node(newX, newY));
                    map[newX][newY]=map[now.x][now.y]+1;
                }
            }
        }
        
    }
}