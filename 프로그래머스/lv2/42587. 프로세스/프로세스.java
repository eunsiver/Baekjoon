import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        
        int []pr=Arrays.copyOf(priorities, priorities.length);
        Arrays.sort(priorities);
        List<Integer> result=new ArrayList<>();
        Deque<Integer> que = new LinkedList<>();
        int n=0;
        
        for(int i: priorities) que.offer(n++);

        for(int i=priorities.length-1;i>=0;i--){
            
            while(priorities[i]>pr[que.getFirst()]){
               
                int k= que.removeFirst();
                que.addLast(k);
            }
            result.add(que.removeFirst());
           
        }
        int rr= result.indexOf(location);
        int answer = rr+1;
        return answer;
    }
}