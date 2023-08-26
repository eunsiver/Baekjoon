import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true;
        
        HashSet<String> hs= new HashSet<>(Arrays.asList(phone_book));
        
        for(String s: hs){
            for(int i=1;i<s.length();i++){
                if(hs.contains(s.substring(0,i))){
                    answer =false;
                }
            }
        }
      
        return answer;
    }
}