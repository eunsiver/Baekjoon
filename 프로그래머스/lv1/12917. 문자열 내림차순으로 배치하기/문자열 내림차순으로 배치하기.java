import java.util.*;
class Solution {
    public String solution(String s) {
        
        
        // 방법1
        char [] c= s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb= new StringBuilder(new String(c));
        System.out.println(sb.reverse().toString());
        
        // 방법2
        return s.chars()
            .boxed()
            .sorted((a,b)->b-a)
            .collect(StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append)
            .toString();
       
       
    }
}