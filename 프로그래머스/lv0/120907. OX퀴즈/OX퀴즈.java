class Solution {
    public String[] solution(String[] quiz) {
     
        int k=0;
        for(int i=0;i<quiz.length;i++){
            String []s=quiz[i].split(" ");
            int result=Integer.parseInt(s[0])+Integer.parseInt(s[2])*(s[1].equals("+")?1:-1);
            quiz[i]=(result==Integer.parseInt(s[4])?"O":"X");
           
        }
        return quiz;
    }
}