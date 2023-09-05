import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
      
        List<Integer> result= new ArrayList<>();
        
        Map<String,Integer> count_map=new HashMap<>();
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<genres.length;i++){
            count_map.put(genres[i],count_map.getOrDefault(genres[i],0)+plays[i]);
        }
        
        List<Map.Entry<String,Integer>> li= new ArrayList<>(count_map.entrySet());
        li.sort((a,b)->b.getValue()-a.getValue());
        
        System.out.println(li);
        
        for(Map.Entry<String,Integer> s: li){
            
            map=new HashMap<>();
            for(int i=0;i<genres.length;i++){
                if(s.getKey().equals(genres[i])){
                    map.put(i,plays[i]);
                }
            }
            List<Map.Entry<Integer,Integer>> mapLi= new ArrayList<>(map.entrySet());
            mapLi.sort((a,b)->{
                if(a.getValue()==b.getValue())return a.getKey()-b.getKey();
                else return b.getValue()-a.getValue();
                 
            });
            System.out.println(mapLi);
            
            for(int i=0;i<2;i++){
                if(!mapLi.isEmpty()){
                   result.add(mapLi.get(0).getKey());
                   mapLi.remove(0);
             }
            }
          
        }
        
        
        return result.stream().mapToInt(i->i).toArray();
    }
}
