import java.util.*;
class Solution {
    boolean solution(String s) {

        long p=Arrays.stream(s.split("")).filter(i->i.equals("p")||i.equals("P")).count();
        long y=Arrays.stream(s.split("")).filter(i->i.equals("Y")||i.equals("y")).count();
        return p==y? true: false;
    }
}