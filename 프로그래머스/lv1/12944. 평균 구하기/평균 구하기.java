import java.util.*;
class Solution {
    public double solution(int[] arr) {
        int a=Arrays.stream(arr).sum();
        double aa=(double)a/arr.length;
        return aa;
    }
}