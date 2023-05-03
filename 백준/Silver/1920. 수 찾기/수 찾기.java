import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        int m=Integer.parseInt(br.readLine());
        int []b= new int[m];
        st= new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < m; i++) {
            b[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int k;
        for (int i = 0; i < m; i++) {
            k=이분탐색(b[i], 0,n-1);

            if(k==-1) sb.append(0+"\n");
            else sb.append(1+"\n");
        }
        System.out.println(sb);
    }
    public static int 이분탐색(int key,int left, int right){
        //찾을 때까지 반복
        int mid;

       while(left<=right){
            mid=(left+right)/2;

            if(key==a[mid]) return mid;

            else if(key<a[mid]){
                right=mid-1;
            }
            else if(key>a[mid]){
                left=mid+1;
            }
        }
        return -1;
    }
}