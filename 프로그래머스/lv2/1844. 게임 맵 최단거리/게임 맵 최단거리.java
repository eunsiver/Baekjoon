import java.util.*;

class Solution {
    
    int [][]maps;
    static int isVisited[][];
    
    public int solution(int[][] maps) {
        this.maps=maps;
        isVisited=new int[maps.length][maps[0].length];
        
        bfs();
        int result=isVisited[maps.length-1][maps[0].length-1];
        return result==0?-1:result;
        
        
    }
    public void bfs(){
        
        Queue<int[]>q=new LinkedList<>();
        int x=0,y=0;
        
        q.add(new int[]{y,x});
        isVisited[y][x]=1;
        
        int []dx={0,1,0,-1};
        int []dy={1,0,-1,0};
        
        while(!q.isEmpty()){
            
            int[] now=q.remove();
            x=now[1];
            y=now[0];
            
            for(int i=0;i<4;i++){
                
                int X=x+dx[i];
                int Y=y+dy[i];
                
                if(X<0||X>maps[0].length-1||Y<0||Y>maps.length-1){
                    continue;
                }
                
                if(maps[Y][X]==1&&isVisited[Y][X]==0){
                    isVisited[Y][X]=isVisited[y][x]+1;
                    q.add(new int[]{Y,X});
                }
            }
        }
    }
}
