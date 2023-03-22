import java.util.*;
class Solution {
    int []speeds;
    int ar[];
    public int[] solution(int[] progresses, int[] speeds) {
        this.speeds=speeds;
        ar=new int[progresses.length];
        List<Integer> checkAr=new LinkedList<>();
        
       for(int i=0;i<progresses.length;i++){
           ar[i]=progresses[progresses.length-i-1];
       }
        
        int k=0;
        
        
        Stack<Integer> st=new Stack<>();
        for(int i:ar)st.add(i);
       // System.out.println(st.pop());
        int i=1;
       int when;
        
       while(!st.isEmpty()){
           when=checkWhen(st.pop(),k);
           i=1;
           while(!st.isEmpty()&&when>=checkWhen(st.peek(),k+1)){
               i++;
               k++;
               int p=st.pop();
               
           }
           checkAr.add(i);
           k++;
           //System.out.println(when);
       
       }
        int result[]=checkAr.stream().mapToInt(o->o).toArray();
        return result;
    }
    public int checkWhen(int num, int index){
        return (100-num)/speeds[index]+((100-num)%speeds[index]==0?0:1);
    }
}