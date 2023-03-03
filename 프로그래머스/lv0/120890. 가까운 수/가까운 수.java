import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] array, int n) {
       
        int answer=0;
        //가장 작은 수를 출력할 수 있도록 하기
        //위해서 먼저 정렬
        Arrays.sort(array);
        for(int i=1;i<array.length;i++){
            if(Math.abs(n-array[0])>Math.abs(n-array[i])) array[0]=array[i];
        }
        answer=array[0];
        return answer;
    }
}