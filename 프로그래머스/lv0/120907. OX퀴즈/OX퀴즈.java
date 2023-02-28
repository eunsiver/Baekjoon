class Solution {
    public String[] solution(String[] quiz) {
      String[] answer = new String[quiz.length];
        int k=0;
        for(int i=0;i<quiz.length;i++){

         
            String []s=quiz[i].split(" ");
            int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[2]);
            int result=Integer.parseInt(s[4]);
            if(s[1].equals("+")){
                if(a+b==result)answer[k++]="O";
                else answer[k++]="X";
            }
            else if(s[1].equals("-")){
                if(a-b==result)answer[k++]="O";
                else answer[k++]="X";
            }
            else if(s[1].equals("*")){
                if(a*b==result)answer[k++]="O";
                else answer[k++]="X";
            }
            else if(s[1].equals("/")){
                if(a/b==result)answer[k++]="O";
                else answer[k++]="X";
            }
            else if(s[1].equals("%")){
                if(a%b==result)answer[k++]="O";
                else answer[k++]="X";
            }
        }
        return answer;
    }
}