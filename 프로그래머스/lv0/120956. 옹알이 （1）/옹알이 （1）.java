class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            String s=babbling[i];
            s=s.replace("aya","0");
            s=s.replace("ye","0");
            s=s.replace("woo","0");
            s=s.replace("ma","0");
            s=s.replace("0","");
            if(s.equals("")) answer+=1;
        }
        
        return answer;
    }
}