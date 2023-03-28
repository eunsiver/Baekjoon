import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        if(yellow ==1 )return new int[]{3,3};
        
        for(int i = 2; i<= yellow; i++){
            
            int result = yellow % i;
            
            if(result == 0){
                
                int k=yellow / i;
                
                if((i + k) * 2 + 4 == brown){
                    
                    return new int[]{Math.max(i+2,k+2),Math.min(i+2,k+2)};
                }
            }
        }
    return new int[]{0,0};
    }
}