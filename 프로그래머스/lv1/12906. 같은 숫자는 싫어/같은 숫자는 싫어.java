import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> ar= new ArrayList<>();
        
        int k=10;
        
        for(int e:arr){
            
            if(e!=k) ar.add(e);
            k=e;
        }
        return ar.stream().mapToInt(i->i).toArray();
    }
}