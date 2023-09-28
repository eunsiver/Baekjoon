import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        
        // 배열을 확장하여 원형 수열을 일반적인 배열로 만듦
        int[] extendedElements = new int[len * 2];
        for (int i = 0; i < len * 2; i++) {
            extendedElements[i] = elements[i % len];
        }
        
        System.out.println(Arrays.toString(extendedElements));
        
        Set<Integer> set = new HashSet<>();
        
        // 연속 부분 수열의 합 계산
        for (int length = 1; length <= len; length++) {
            
            for (int start = 0; start < len; start++) {
                int sum = 0;
                for (int i = start; i < start + length; i++) {
                    sum += extendedElements[i];
                }
                set.add(sum);
            }
        }
        
        // 중복을 제거한 연속 부분 수열 합의 개수 반환
        return set.size();
    }
}
