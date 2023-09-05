import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> li= new ArrayList<>();
        int el=-1;
        for(int k: arr){
            if(el!=k){
                li.add(k);
                el=k;
            }
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}