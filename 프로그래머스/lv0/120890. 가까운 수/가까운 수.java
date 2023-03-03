import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] array, int n) {
       
        TreeSet<Integer> t= new TreeSet<>();
        int di=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int ne=Math.abs(n-array[i]);
            di=ne<di?ne:di;
            
        }
        for(int i=0;i<array.length;i++){
            int ne=Math.abs(n-array[i]);
            if(di==ne){
                t.add(array[i]);
            }
            
        }
        return t.first();
    }
}