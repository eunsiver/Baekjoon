class Solution {
    public int[] solution(long n) {
        String s= String.valueOf(n);
        
        StringBuilder sb=new StringBuilder(s);
        String sr= sb.reverse().toString();
        
        int []ar=new int[sb.length()];
        
        for(int i=0;i<sr.length();i++){
            ar[i]=sr.charAt(i)-'0';
        }
        
        return ar;
    }
}