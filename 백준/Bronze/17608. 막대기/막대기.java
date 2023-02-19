import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<n;i++){
            stack.push(Integer.parseInt(br.readLine()));
        }
        int check=stack.pop();
        int count=1;
        int c;
        while(!stack.isEmpty()){
            c=stack.pop();
            if(c>check){
                count++;
                check=c;
            }


        }
        System.out.println(count);
    }
}
