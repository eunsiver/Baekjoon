import java.util.*;
import java.util.stream.*;

class Solution {
    
    static HashSet<Integer> num_set= new HashSet<>();
    static StringBuilder sb= new StringBuilder();
    static boolean visited[];
    static int len;
    static List<Integer> li;
    static int []ar;
        
    public int solution(String numbers) {
        
        li= numbers.chars().map(i-> i-'0').boxed().collect(Collectors.toList());
        len= li.size();
        ar=new int[len];
        for(int i=0;i<len;i++){
            visited=new boolean [len];
            sb.setLength(0);
            recur(i+1, 0);
        }
        
        int c=sosuCount(num_set);
        return c;
    }
    private int sosuCount(HashSet<Integer> num_set){
        int count=0;
        
        for(int num: num_set){
            if(findSosu(num))count++;
        }
        return count;
    }
    
    private boolean findSosu(int num){
        
          if(num<=1)return false;
        
          for(int i=2;i*i<=num;i++){
            if(num%i==0) {
               // System.out.println(num+"은 소수가 아닙니다.");
                return false;
            }
        }
        //System.out.println(num+"은 소수는 소수입니다.");
        return true;
    }
    
    private void recur(int end, int depth){
        
        if (end==depth){
           
            for(int i=0;i<depth;i++){
                sb.append(ar[i]);
            }
            // System.out.println(Integer.parseInt(sb.toString()));
            num_set.add(Integer.parseInt(sb.toString()));
            sb.setLength(0);
            return;
        }
        
        for(int i=0;i<len;i++){
            if(!visited[i]){
                
                visited[i]=true;
                ar[depth]=li.get(i);
                recur(end, depth+1);
                visited[i]=false;
            }
        }
    }
}