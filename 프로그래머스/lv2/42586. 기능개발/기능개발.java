import java.util.stream.*;
import java.util.*;
class Solution {
   
    int ar[];
    List<Integer> li = new ArrayList<>();
    
    public int[] solution(int[] progresses, int[] speeds) {
        
        ar= new int[speeds.length];
        checkSpeed(progresses,speeds);
        bapo();
        
        System.out.println(li);
        return li.stream().mapToInt(i->i).toArray();
    }
    
    public void bapo(){
        
        Deque<Integer> que= new LinkedList<>(Arrays.stream(ar).boxed().collect(Collectors.toList()));
       
        
        for(int i=0;i<ar.length;i++){
           int k=que.pop();
            int c=0;
            while(!que.isEmpty()&&k>=que.peek()){
                que.pop();
                c++;
            }
            li.add(c+1);
            i+=c; 
        }
    }
    
    public void checkSpeed(int[] progresses, int[] speeds){
        
        for(int i=0;i<progresses.length;i++){
            
            int k=100-progresses[i];
            ar[i] = k/speeds[i] + (k%speeds[i]==0? 0:1);
        }
        
    }
}