import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        //1.yellow의 약수를 찾고
        //2.그 약수들이 (a+b)*2+4==brown과 만족하면, return [a+2,b+2]
        
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
