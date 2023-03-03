class Solution {
    public int solution(String t, String p) {
        int pLen=p.length();
        Long pInt=Long.parseLong(p);
        int tLen=t.length();
        int count=0;
        for(int i=0;i<=tLen-pLen;i++){
            Long check=Long.parseLong(t.substring(i,i+pLen));
            if(check<=pInt)count++;
            
        }
        return count;
    }
}