import java.util.Stack;

class Solution
{
    //그냥 배열로 풀면 효율성 통과를 못함
    //스택으로 풀자
    public int solution(String s)
    {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
         
        for(int i=1;i<s.length();i++){
           
            char c=s.charAt(i);
            if(!st.isEmpty() &&st.peek()==c) st.pop();
            else st.push(c);
            
         }
        return st.isEmpty()?1:0;
    }
}