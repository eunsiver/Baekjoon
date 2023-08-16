import java.util.Arrays;


class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long start = 1, end = times[times.length-1]*(long)n;
        
        while(start <= end){
            long time = (start+end)/2;
            if(determine(n, times, time)){
                end = time-1;
                answer = time;
            }else{
                start=time+1;
            }
        }
        return answer;
    }
    
    private boolean determine(int n, int[] times, long time){
        long person = 0;
        for(int i=0; i<times.length; i++)
            person += time/times[i];
        return person >= n;
    }
}

//전체 걸리는 시간이 몇분일때 가장 최적화될까
//28/4+28/10