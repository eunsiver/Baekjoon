import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack= new Stack<>();

        int n= Integer.parseInt(br.readLine());
        int ar[]=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            ar[i]= Integer.parseInt(st.nextToken());
        }
        for (int i = n-1; i >=0 ; i--) {

            while(!stack.isEmpty()&&ar[stack.peek()]<ar[i]){
                ar[stack.pop()]=i+1;
            }
            stack.push(i);
        }
        for(int i: stack){
            ar[i]=0;
        }
        StringBuilder sb=new StringBuilder();

        for(int i: ar){
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}
