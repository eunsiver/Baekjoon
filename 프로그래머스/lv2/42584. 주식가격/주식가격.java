import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        
        int []result=new int[prices.length];
        
        for(int i=0;i<prices.length;i++){
            int now=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(now>prices[j]){
                    result[i]=j-i;
                    break;
                }
                result[i]=prices.length-1-i;
            }
        }
        return result;
    }
}