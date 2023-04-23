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

        for (int i = 0; i <n ; i++) {
            ar[i]= Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <n; i++) {

            while(!stack.isEmpty()&&ar[stack.peek()]<=ar[i]){
                int p=stack.pop();
                ar[p]=i-1-p;
            }
            stack.push(i);
        }
        for(int i: stack){
            ar[i]=n-i-1;
        }
        long sum=0;
        for(int i: ar){
           sum+=i;
        }

        System.out.println(sum);
    }
}
