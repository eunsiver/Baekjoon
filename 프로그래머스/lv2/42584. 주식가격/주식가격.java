import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        
        int[] answer =new int[prices.length];
        Arrays.fill(answer,0);
        
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                
                answer[i]++;
                //System.out.printf("%d %d\n",answer[i],answer[j]);
                if(prices[j]<prices[i])break;
                
            }
        }
        
        return answer;
    }
}