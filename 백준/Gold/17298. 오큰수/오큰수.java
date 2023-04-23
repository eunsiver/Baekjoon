import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack= new Stack<>();

        int n= Integer.parseInt(br.readLine());
        long ar[]=new long[n];
        StringTokenizer st= new StringTokenizer(br.readLine());

        for (int i = 0; i <n ; i++) {
            ar[i]= Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <n; i++) {

            while(!stack.isEmpty()&&ar[stack.peek()]<ar[i]){
                ar[stack.pop()]=ar[i];
            }
            stack.push(i);
        }

        for(int i: stack){
            ar[i]=-1;
        }
        StringBuilder sb= new StringBuilder();
        for (long k:ar) {
            sb.append(k+" ");
        }
        System.out.println(sb);
    }
}
