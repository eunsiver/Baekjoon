import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
        Stack<Integer>st=new Stack<>();
        StringTokenizer sToken=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            ar[i]=Integer.parseInt(sToken.nextToken());
        }
        int k=n-1;
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty()&&ar[st.peek()]<ar[i]){
                ar[st.pop()]=i+1;
            }
            st.push(i);
        }
        for(int o:st){
            ar[o]=0;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:ar){
            sb.append(i+" ");

        }
        System.out.print(sb);
    }
}
