import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)return new int[]{-1};
        int[] answer = arr.clone();
        
        Arrays.sort(arr);
        
        int [] n=new int[answer.length-1];
        int k=0;
        
        for(int i=0;i<answer.length;i++){
            if(arr[0]!=answer[i])
                n[k++]=answer[i];
        }
        return n;
    }
}