class Solution {
    public String solution(int n) {
        StringBuilder s=new StringBuilder();
         for(int i=0;i<n/2;i++){
                s.append("수박");
            }
        if(n%2!=0){
           s.append("수");
        }
         return s.toString();
    }
   
}