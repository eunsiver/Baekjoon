import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> st= new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            Character now=s.charAt(i);
            if(st.isEmpty()||now=='(')st.push(now);
            else if(now==')'&&!st.isEmpty())st.pop();
        }
        
        if(st.isEmpty())return true;
        else return false;
    }
}