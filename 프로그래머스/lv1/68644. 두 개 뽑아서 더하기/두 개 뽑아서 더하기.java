import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> s=new HashSet<>();
        
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                s.add(numbers[i]+numbers[j]);
            }
        }
        
        System.out.println(s);
        return s.stream().mapToInt(i->i).sorted().toArray();
        
    }
}