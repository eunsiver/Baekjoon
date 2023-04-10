import java.util.*;
class Solution {
    
    int []a={1,2,3,4,5};
    int []b={2,1,2,3,2,4,2,5};
    int []c={3,3,1,1,2,2,4,4,5,5};
    
    int x=0,y=0,z=0;
    
    //반복하면서 각자 맞았는지 확인 
    //맞으면 count++
    //Max값을 구해서 같으면 배열에 넣기
    
    public int[] solution(int[] answers) {
    
        int [] result=new int [3];
        
        for(int i=0;i<answers.length;i++){
            if(answers[i]==a[i%5])
                x++;
            if(answers[i]==b[i%8])
                y++;
            if(answers[i]==c[i%10])
                z++;
        }
        int max=Math.max(Math.max(x,y),z);
        int k=0;
      
            if(max==x)
                result[k++]=1;
            if(max==y)
                result[k++]=2;
            if(max==z)
                result[k++]=3;
        
        return Arrays.stream(result).filter(i->i!=0).toArray();
    }
}