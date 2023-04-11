import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Map<Integer, Integer> map=new HashMap<>();
        
        for(int n:nums){
            map.putIfAbsent(n,0);
            map.put(n,map.get(n)+1);
        }
        System.out.println(map);
        
        int getNum=nums.length/2;
        
        if(map.size()>=getNum) return getNum;
        else return map.size();
       
    }
}

//해시맵에 저장
//배열의 길이 / 2 마리 포켓몬 선택 중 가장 많은 포켓몬 선택
// hashmap 키의 개수 >= 배열의 길이 / 2 -> 배열의 길이 / 2
// < -> 키의 개수로 반환