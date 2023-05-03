import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {

    static int n;
    static int []a;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(br.readLine());
        a = new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine()," ");

        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int m=Integer.parseInt(br.readLine());
        int k;
        st= new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < m; i++) {
            k=Integer.parseInt(st.nextToken());
            sb.append(upper(k,0,n)-lower(k,0,n)).append(' ');
        }

        System.out.println(sb);
    }
    public static int lower(int key,int left, int right){
        //찾을 때까지 반복
        int mid;

       while(left<right){
            mid=(left+right)/2;

            if(key<=a[mid])  right=mid;

            else left=mid+1;
        }
        return left;
    }
    public static int upper(int key,int left, int right){
        //찾을 때까지 반복
        int mid;

        while(left<right){
            mid=(left+right)/2;

            if(key<a[mid])  right=mid;

            else left=mid+1;
        }
        return left;
    }
}