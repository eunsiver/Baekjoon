import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i: nums) hs.add(i);
        
        int answer = Math.min(hs.size(), nums.length/2);
        return answer;
    }
}

// N/2 마리
// HashMap으로 