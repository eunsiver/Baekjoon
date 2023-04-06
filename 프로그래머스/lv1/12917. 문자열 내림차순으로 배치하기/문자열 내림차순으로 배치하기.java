import java.util.*;
class Solution {
    public String solution(String s) {
        
        
        // 방법1
        char [] c= s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb= new StringBuilder(new String(c));
        return sb.reverse().toString();
       
    }
}