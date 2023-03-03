class Solution {
    public int solution(String s) {
        if(s.contains("-")){
            s=s.substring(1,s.length());
            return -1*Integer.parseInt(s);
        }
        else return 1*Integer.parseInt(s);
    }
}