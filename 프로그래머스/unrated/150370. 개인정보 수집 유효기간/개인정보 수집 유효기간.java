//모든 날짜가 28일
import java.util.*;
class Solution {
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        ArrayList<Integer>ar=new ArrayList<>();
        int sum=0;
        String []s;
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<terms.length;i++){
            s=terms[i].split(" ");
            map.put(s[0],s[1]);
        }
        int todaySum=getSum(today);
        
        for(int i=0;i<privacies.length;i++){
            sum=0;
            s=privacies[i].split(" ");
            int n=Integer.parseInt(map.get(s[1]));
            
            sum=getSum(s[0])+n*28;
            if(todaySum>=sum){
                ar.add(i+1);
            }
            
        }
        answer=ar.stream().mapToInt(Integer::intValue).toArray();
        return answer;
        
    }
    public int getSum(String s){
        int year=Integer.parseInt(s.substring(2,4));
        int month=Integer.parseInt(s.substring(5,7));
        int day=Integer.parseInt(s.substring(8,10));
        int sum=(year*12*28+month*28+day);
        return sum;
        
    }
}