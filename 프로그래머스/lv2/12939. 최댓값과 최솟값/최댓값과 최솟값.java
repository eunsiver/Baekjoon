class Solution {
    public String solution(String s) {
        StringBuilder sb=new StringBuilder();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        String []a=(s.split(" "));
        for(String i:a){
            int k=Integer.parseInt(i);
            min=k<min?k:min;
            max=k>max?k:max;
        }
        sb.append(min).append(" ").append(max);
        
        System.out.println(sb);
        
        return sb.toString();
    }
}