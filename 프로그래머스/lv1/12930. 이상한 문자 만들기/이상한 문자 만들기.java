
import java.lang.*;
import java.util.*;
class Solution {
    public String solution(String s) {
        int len=s.length();
        int start=0;
        int count=0;
        StringBuilder sb= new StringBuilder();
        while(len> 0){
            char c= s.charAt(start);
            if(count%2==0){
                sb.append(Character.toUpperCase(c));
            }
            else sb.append(Character.toLowerCase(c));
            count++;
            
            if(c==' ')count=0;
            len--;
            start++;
        }
        return sb.toString();
    }
}