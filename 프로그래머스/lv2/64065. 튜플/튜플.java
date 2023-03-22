import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        String [] ar= s.substring(2,s.length()-2).replaceAll("[{}]"," ").split(" , ");
        
        
        //길이 순대로 정렬
        Arrays.sort(ar,(o1,o2)-> o1.length()-o2.length());
        
        //set에 집어 넣으면 끝!
        Set<Integer> sett=new LinkedHashSet<>();
        
        for(int i=0;i<ar.length;i++){
            String [] check=ar[i].split(",");
            for(int j=0;j<check.length;j++){
                sett.add(Integer.parseInt(check[j]));
            }
            
        }
        
       
        answer=sett.stream().mapToInt(i->i).toArray();
        return  answer;
    }
}