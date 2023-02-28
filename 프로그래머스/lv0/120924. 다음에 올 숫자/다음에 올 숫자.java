class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean is=true;
        int a=common[1]-common[0];
        int b=common[2]-common[1];
        //등차수열
        if(a==b)
            answer=common[common.length-1]+a;
        //등비수열
        else
            answer=common[common.length-1]*(common[1]/common[0]);
        return answer;
    }
}