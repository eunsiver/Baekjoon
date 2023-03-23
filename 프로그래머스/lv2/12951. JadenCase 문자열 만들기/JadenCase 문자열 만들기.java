import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] as=s.toLowerCase().split(" ");
        for(int i=0;i<as.length;i++){
            if(as[i].length() == 0) answer.append(" ");
            else{
                as[i]=as[i].substring(0,1).toUpperCase()+as[i].substring(1);
                answer.append(as[i]+" ");}
        }
        answer=s.substring(s.length()-1).equals(" ")? answer.append(" "):answer;
        return answer.substring(0,answer.length()-1);
    }
}