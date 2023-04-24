import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st= new StringTokenizer(br.readLine()," ");
        StringBuilder sb= new StringBuilder();
        int a[]=new int [26];
        int b[]=new int [26];

        char []x=br.readLine().toCharArray();
        char []y=br.readLine().toCharArray();

        for(char i:x){
            a[i-'0'-49]++;
        }
        for(char i:y) b[i-'0'-49]++;

        int sum=0;

        for(int i=0;i<26;i++){
            if(a[i]==0&&b[i]==0)continue;
            sum+=Math.abs(a[i]-b[i]);
        }

        System.out.println(sum);
    }
}
