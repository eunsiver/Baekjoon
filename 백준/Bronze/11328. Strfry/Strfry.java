import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int k=Integer.parseInt(br.readLine());

        for(int i=0;i<k;i++){
            String []s=br.readLine().split(" ");

            char []x=s[0].toCharArray();
            char []y=s[1].toCharArray();
            int a[]=new int [26];

            for(char c:x) a[c-'0'-49]++;
            for(char c:y) a[c-'0'-49]--;

            int sum=0;

            for(int j=0;j<26;j++){
                sum+=Math.abs(a[j]);
            }
            if(sum==0) System.out.println("Possible");
            else System.out.println("Impossible");
        }
    }
}
