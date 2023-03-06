class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        //배열 길이가 1이면 바로 return -1
        if(arr.length==1){
            answer=new int[1];
            answer[0]=-1;
            return answer;
        }
        answer=new int[arr.length-1];
        //가장 작은 수 찾기
        int min= Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            min=arr[i]<min?arr[i]:min;
            
        }
        //그 인덱스만 빼고 옴기기
        int k=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=min)answer[k++]=arr[i];
        }
        return answer;
        
    }
}