import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> ar= new ArrayList<>();
        
        Stack<Integer> st= new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            st.push(arr[i]);
        }
        int k=0;
        while(!st.isEmpty()){
            int el= st.pop();
            ar.add(el);
            while(!st.isEmpty()&&st.peek()==el){
                st.pop();
            }
        }

        return ar.stream().mapToInt(i->i).toArray();
    }
}