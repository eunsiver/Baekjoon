import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

class Solution {
    public int solution(String s) {
        
        Map<String, Integer> map= new HashMap(){{
            put("zero",0);
            put("one",1);
            put("two",2);
            put("three",3);
            put("four",4);
            put("five",5);
            put("six",6);
            put("seven",7);
            put("eight",8);
            put("nine",9);
            
        }};
        
        Set<String> sset= map.keySet();
        
        while(true){
            if(!s.matches("[0-9]")){
                for(String eng: sset){
                    if(s.contains(eng)){
                        s= s.replace(eng,map.get(eng)+"");
                     }
                    
                }
            }
            
            int answer = Integer.parseInt(s);
             return answer;
        }

    }
}

//Map<String, Integer>
//for(10번)contain, replace
