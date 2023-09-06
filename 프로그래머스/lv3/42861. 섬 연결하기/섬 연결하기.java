import java.util.*;

class Solution {
    
    public void union(int[] parent, int a, int b){
        int a_parent= find(parent, a);
        int b_parent= find(parent, b);
        
        if(a_parent< b_parent){
            parent[b_parent]=a_parent;
        }
        else parent[a_parent]=b_parent;
    }
    
    public int find(int [] parent, int i){
        if(parent[i]==i){
            return i;
        }
        return find(parent, parent[i]);
    }
    
    public int solution(int n, int[][] costs) {
       
        
        int []parent= new int[n];
        
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        
        Arrays.sort(costs, (int [] a, int []b)->{
            return a[2]-b[2];
        });
        
        int total=0;
        
        for(int i=0;i< costs.length;i++){
            if(find(parent, costs[i][0])!=find(parent, costs[i][1])){
                total+=costs[i][2];
                union(parent, costs[i][0],costs[i][1]);
            }
        }
        return total;
    }
    
}