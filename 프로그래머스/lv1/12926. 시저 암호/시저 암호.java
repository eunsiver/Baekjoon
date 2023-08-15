class Solution {
    public String solution(String s, int n) {
        
        //문자열 길이만큼 for문
        //공백이면 넘어감
        StringBuilder sb= new StringBuilder();
        int len=s.length();
        
        for(int i=0;i<len;i++){
            
            char c= s.charAt(i);
            
            if(Character.isUpperCase(c)) sb.append((char) ((c-'A'+n)%26 +'A') );
            else if(Character.isLowerCase(c))sb.append((char) ((c-'a'+n)%26 +'a') );
            else sb.append(" ");
            
        }
        String answer = sb.toString();
        return answer;
    }
}