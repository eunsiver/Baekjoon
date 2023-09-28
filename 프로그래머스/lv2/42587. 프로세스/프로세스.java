import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int []pr=Arrays.copyOf(priorities, priorities.length);
        //내림차순으로 sort하고
        Arrays.sort(priorities);
        List<Integer> result=new ArrayList<>();
        
        //큐에 배열을 index값을 넣음
        Deque<Integer> que = new LinkedList<>();
        int n=0;
        for(int i: priorities){
            que.offer(n++);
        }
        System.out.println(que);
        for(int i=priorities.length-1;i>=0;i--){
            
            System.out.println("now"+i);
            
            while(priorities[i]>pr[que.getFirst()]){
                System.out.println("priorities[i] : "+priorities[i]+" priorities[que.getFirst()] : " +priorities[que.getFirst()]+" que: " +que);
                int k= que.removeFirst();
                que.addLast(k);
            }
            result.add(que.removeFirst());
            System.out.println(result);
        }
        int rr= result.indexOf(location);
        
        System.out.println(rr+1);
        int answer = rr+1;
        return answer;
    }
}