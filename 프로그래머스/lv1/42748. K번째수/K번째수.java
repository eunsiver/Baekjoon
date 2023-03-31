import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> li=new ArrayList<>();
         List<Integer> m=new ArrayList<>();
        int a,b,c;
        
        for(int i=0;i<commands.length;i++){
            li=new ArrayList<>();
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];
            
            for(int j=a-1;j<=b-1;j++){
                li.add(array[j]);
            }
            Collections.sort(li);
            m.add(li.get(c-1));
            
            System.out.println();
        }
        int[] answer = m.stream().mapToInt(i->i).toArray();
        return answer;
    }
}