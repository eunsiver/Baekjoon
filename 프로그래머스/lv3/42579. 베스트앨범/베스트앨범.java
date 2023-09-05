import java.util.*;
class Solution {
public int[] solution(String[] genres, int[] plays) {

    List<Integer> result= new ArrayList<>();
    Map<String,Integer> count_map=new HashMap<>();
    Map<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<genres.length;i++){
        count_map.put(genres[i],count_map.getOrDefault(genres[i],0)+plays[i]);
    }

    //pop 3100, classic 1450 value의 오름차순으로 sort
    List<Map.Entry<String,Integer>> li= new ArrayList<>(count_map.entrySet());
    li.sort((a,b)->b.getValue()-a.getValue());

    System.out.println(li);
    //모든 장르를 돌면서
    for(Map.Entry<String,Integer> s: li){

        //현재 장르와 같은 것을 map에 인덱스와 plays의 값을 함께 넣음
        map=new HashMap<>();
        for(int i=0;i<genres.length;i++){
            if(s.getKey().equals(genres[i])){
                map.put(i,plays[i]);
            }
        }
        //현재 장르의 재생 횟수를 sort, 많은 재생 노래 수록 후, 같은 노래는 index부터
        List<Map.Entry<Integer,Integer>> mapLi= new ArrayList<>(map.entrySet());
        mapLi.sort((a,b)->{
            if(a.getValue()==b.getValue())return a.getKey()-b.getKey();
            else return b.getValue()-a.getValue();

        });

        //답에 넣기
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