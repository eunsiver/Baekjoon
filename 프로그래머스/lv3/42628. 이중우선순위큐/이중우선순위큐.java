import java.util.*;
import java.util.PriorityQueue;

class Solution {
    
    public int[] solution(String[]operations) {
        
        int[] answer = new int[2];
        
        PriorityQueue<Integer> queMin= new PriorityQueue<>();
        PriorityQueue<Integer> queMax= new PriorityQueue<>(Collections.reverseOrder());

        for( String s :operations ){
            
            String []ar= s.split(" ");
            
           if(ar[0].equals("I")){
               queMax.offer(Integer.parseInt(ar[1]));
               queMin.offer(Integer.parseInt(ar[1]));
               
               System.out.println(queMax);
               System.out.println(queMin);
           }
            
            else if(ar[0].equals("D")){
                if(ar[1].equals("1")&& !queMax.isEmpty()){
                    int p=queMax.poll();
                    System.out.println("max:"+p);
                    queMin.remove(p);
                }
                else if(ar[1].equals("-1")&& !queMin.isEmpty()){
                     int p=queMin.poll();
                    System.out.println("min: "+p);
                    queMax.remove(p);
                }
            };
        }
        
        if(queMax.isEmpty()){
                answer= new int[]{0,0};
        }
        else{
                
            answer=new int []{queMax.poll(),queMin.poll()};
        }
        System.out.println();
        
        return answer;
    
}
}

/**
우선순위 큐 두개 만든다

for 배열 전체 다
if char check -> offer poll

| : offer
D : queMax.poll()
D - : queMax.poll()



*/