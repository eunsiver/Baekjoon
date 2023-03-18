import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String s=my_string.replaceAll("[a-z]","");
        String[] c=s.split("");
        
        int[] answer = Arrays.stream(c).mapToInt(i->Integer.parseInt(i)).toArray();
        Arrays.sort(answer);
        return answer;
    }
}