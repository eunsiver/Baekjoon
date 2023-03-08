class Solution {
    public int solution(int n) {
        int answer = 0,checkNum=0,next=0;
        String check;
        
        //1,2 조건을 만족할때까지 반복
        boolean flag=false;
        //n이진수 변환하여 1의 숫자 찾기
        String nn=Integer.toBinaryString(n);
        int nnNum=nn.length()-nn.replace("1","").length();
        do{
            next=++n;
            check=Integer.toBinaryString(next);
            checkNum=check.length()-check.replace("1","").length();
            if(nnNum==checkNum)flag=true;
        }while(!flag);
        
        answer=next;
        return answer;
    }
}