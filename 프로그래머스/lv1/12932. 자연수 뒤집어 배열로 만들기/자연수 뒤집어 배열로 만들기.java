import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(long n) {
        
        //입력 받은 숫자를 문자열로 변환
        //문자열 뒤집기
        //뒤집힌 문자열을 문자의 배열로 변환
        //배열의 각 문자를 정수로 변환
        
        String s = Long.toString(n);
        s= new StringBuilder(s).reverse().toString();
        
        int len= s.length();
        int[] answer = new int[len];
        
        for(int i=0;i<len;i++){
            answer[i]=s.charAt(i)-'0';
        }
        return answer;
    }
}