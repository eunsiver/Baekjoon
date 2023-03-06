class Solution {
    public String solution(String s) {
        String answer = "";
        int len=s.length();
        int index;
        //짝
        if(len%2==0){
            index=len/2-1;
            answer=s.substring(index,index+2);
        }else{
            index=len/2;
            answer=s.substring(index,index+1);
        }
        return answer;
    }
}