import java.util.*;
import java.util.stream.*;
class Solution {
    public Long solution(long n) {
        
        Integer ar[] = Stream.of(String.valueOf(n).split("")).map(Integer::parseInt).toArray(Integer[]::new);
   
        Arrays.sort(ar,(o1,o2)->o2-o1);
        String s=(Arrays.toString(ar)).replaceAll(", ","");
        s=s.substring(1,s.length()-1);
        
        return Long.parseLong(s);
        
      
    }
}