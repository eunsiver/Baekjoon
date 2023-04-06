import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 특정 구간 잘라내기
        // 정렬하기
        // 정렬된 배열에서 k번째 수 구하기
        int [] answer=new int[commands.length];
        
        for(int i=0;i<answer.length;i++){
            int []command=commands[i];
            
            int from =command[0]-1;
            int to= command[1];
            int k=command[2]-1;
            
            int [] copy=Arrays.copyOfRange(array,from,to);
            Arrays.sort(copy);
            answer[i]=copy[k];
        }
        
        return answer;
    }
}