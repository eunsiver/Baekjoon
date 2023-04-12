import java.util.*;

class Solution {
    
    static Deque<Character> de=new ArrayDeque<>();
    StringBuilder sb=new StringBuilder();
    
    public String rotation(String s){
        return sb.append(s.substring(1,s.length())).append(s.substring(0,1)).toString();
    }
    
    public int isRight(String s){
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char now=s.charAt(i);
           
            
            if(st.isEmpty()||now=='('||now=='{'||now=='[')
                st.push(now);
            else if(!st.isEmpty()){
                char peek=st.peek();
                if((now==')'&&peek=='('||now=='}'&&peek=='{'||now==']'&&peek=='['))
                    st.pop();
            } 
        }
        if(st.isEmpty())return 1;
        return 0;
    } 
    
    public int solution(String s) {
        
        int count=0;
        
        for(int i=0;i<s.length();i++){
            //회전
            String newS = rotation(s);
          
            //올바른 괄호 문자열 인지 확인
            count+=isRight(newS);
            sb.setLength(0);
            s=newS;
        }
        int answer = count;
        return answer;
    }
}