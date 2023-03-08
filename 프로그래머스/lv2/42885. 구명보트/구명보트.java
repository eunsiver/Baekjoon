import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        //문제를 꼼꼼히 읽자!
        // 한 번에 최대 2명씩 밖에 탈 수 없다.
        
//    1. 몸무게가 가장 적게나가는 사람 + 몸무게가 가장 많이나가는 사람 <= 보트 최대 하중(limit)
//      : 해당 조건일 경우 최대 2명의 인원이 보트를 타고 갈수 있다.
//    2. 몸무게가 가장 적게나가는 사람 + 몸무게가 가장 많이나가는 사람 > 보트 최대 하중(limit)
//      : 해당 조건일 경우 몸무게가 가장 많이나가는 사람 1명이 보트를 타고 갈수 있다.
        
        //오름차순 정렬
        
        int answer=0;
        Arrays.sort(people);
        int first=0;
        int end=people.length-1;
        while (first <= end) {
            if (people[first] + people[end] <= limit) {
             first++;
            }
        end--;
        answer++;
        }
        return answer;
    }
    
}