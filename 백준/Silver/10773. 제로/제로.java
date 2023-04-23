import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st= new Stack<>();

        int n= Integer.parseInt(br.readLine());
        int k=0;

        while(n-->0){
            k=Integer.parseInt(br.readLine());
            if (k == 0&&!st.isEmpty()) {
                st.pop();
            } else {
                st.push(k);
            }
        }

        int sum=0;
        for(int i:st){
            sum+=i;
        }
        System.out.println(sum);
    }
}
