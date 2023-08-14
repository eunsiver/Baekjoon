import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        Deque<Integer> que= new LinkedList<>();
        
        for(int i: numbers){
            que.offer(i);
        }
        if(direction.equals("right")){
            que.offerFirst(que.pollLast());
        }
        else{
            que.offerLast(que.pollFirst());
        }
       
        
        answer=new int[que.size()];
        int k=0;
        while(!que.isEmpty()){
            answer[k++]=que.poll();
        }
        return answer;
    }
}