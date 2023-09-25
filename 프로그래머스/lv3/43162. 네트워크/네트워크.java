import java.util.*;

class Solution {
    
    boolean visited[];
    int[][] computers;
    int n;
    
    public int solution(int n, int[][] computers) {
        
        visited = new boolean[n];
        this.computers = computers;
        this.n=n;
        
        int count=0;
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                DFS(i);
                count++;
            }
        }
        
        int answer = count;
        return answer;
    }
    public void DFS(int k){
        visited[k]=true;
     
        for(int i=0;i<n;i++){
            if(computers[k][i]==1 && !visited[i]){
                //System.out.println(i+" "+ k + " "+visited[i]);
                DFS(i);
            }
        }
    }
}