class Solution {
    public int[] solution(int n, int t) {
        int a=(2*t-n*n+n)/(2*n);
        System.out.println(a);
        int[] answer=new int[n];
        for(int i=0;i<n;i++){
            answer[i]=a+i;
        }
        return answer;
    }
}