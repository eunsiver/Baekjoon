class Solution {
    public int[] solution(String s) {
        int c=0;
        int ar[]=new int[2];
        while(s.length()>1){
             c=0;
             for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0') ar[1]++;
                else c++;
                }
             s=Integer.toBinaryString(c);
             ar[0]++;
        }
       
        return ar;
    }
    
 
}