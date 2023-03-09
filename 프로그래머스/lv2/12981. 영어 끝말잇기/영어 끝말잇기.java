
import java.util.*;
class Solution {
    
    public int[] solution(int n, String[] words) {
        //가장 먼저 탈락하는 사람, 몇번째 차례에 탈락하는지
        //마지막 문자로 시작하지 않으면 탈락
        //같은 게 있으면 탈락
        int seq=0, forNum=1;
        ArrayList<String>sL=new ArrayList<>();
        int[] answer = {0,0};
        for(String s: words){
            seq++;
            
           // String sbs=sb.toString();
            
            if(s.length()==1){
                answer[0]=seq;
                answer[1]=forNum;
                return answer;
            }
            if(!sL.isEmpty()){
                String ss=sL.get(sL.size()-1);
                char c=ss.charAt(ss.length()-1);
                if((sL.contains(s)||c!=s.charAt(0))){
                    answer[0]=seq;
                    answer[1]=forNum;
                    return answer;
                }
            }
            
           
            sL.add(s);
    
            if(seq%n==0){
                forNum++;
                seq=0;
            }
        }

        return answer;
    }
}