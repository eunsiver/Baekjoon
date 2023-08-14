class Solution {
    static int[] answer;
    
    public boolean out(int [][]arr, int x, int y, int size){
        
        for(int i=x; i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if(arr[x][y]!=arr[i][j])
                    return false;//같지 않음
            }
        }
        return true;//다 같음
    }
    
    public void quad(int [][]arr, int x, int y, int size){
        //종료 조건!!
        //다 같을 경우
        if(out(arr,x,y,size)){
            //1인 경우
            if(arr[x][y]==1) answer[1]++;
            //0인 경우
            else answer[0]++;
            return;
        }
        int L=size/2;
        quad(arr,x,y,L);
        quad(arr,x+L,y,L);
        quad(arr,x,y+L,L);
        quad(arr,x+L,y+L,L);
    }
    public int[] solution(int[][] arr) {
        answer = new int[2];
        quad(arr, 0, 0, arr.length);
        return answer;
    }
}