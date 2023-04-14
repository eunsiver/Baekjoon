import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String s= Integer.toString(n);
        int []nn=Arrays.stream(s.split(""))
            .mapToInt(Integer::parseInt).toArray();
       
        for(int i: nn){
            answer+=i;
        }
        

        return answer;
    }
}