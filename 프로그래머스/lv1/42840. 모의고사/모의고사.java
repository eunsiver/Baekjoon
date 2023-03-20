import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int []a={1,2,3,4,5};
        int []b={2,1,2,3,2,4,2,5};
        int []c={3,3,1,1,2,2,4,4,5,5};
        int ac=0,bc=0,cc=0;
        
        for(int i=0;i<answers.length;i++){
            if(a[i%5]==answers[i]) ac++;
            if(b[i%8]==answers[i]) bc++;
            if(c[i%10]==answers[i])cc++;
        }
        
        System.out.println(ac+" "+bc+" "+cc);
        int max=Math.max(Math.max(ac,bc),cc);
        
        List<Integer> list = new ArrayList<>();
        
        if(max == ac)
            list.add(1);
        if(max == bc)
            list.add(2);
        if(max == cc)
            list.add(3);
        
        
       
        return list.stream().mapToInt(i->i).toArray();
    }
}