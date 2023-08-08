import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer dp[]=new Integer[11];
        Scanner sc=new Scanner(System.in);


        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i=4;i<=10;i++){
          dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            System.out.println(dp[k]);
        }

    }
}
