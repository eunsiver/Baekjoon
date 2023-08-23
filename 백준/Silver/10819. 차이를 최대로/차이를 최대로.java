import java.util.Scanner;

public class Main {
    static int []ar, ans;
    static boolean []visited;
    static int n;
    static int max=Integer.MIN_VALUE;
    static int result=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n= sc.nextInt();
        ar=new int[n];
        ans=new int[n];
        visited=new boolean[n];

        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }

        dfs(0);
        System.out.println(result);
    }
    private static void dfs(int depth){

       if(depth==ar.length){
           int sum=0;
           for(int i=0;i<ar.length-1;i++){
               sum+=Math.abs(ans[i]-ans[i+1]);
           }
           result=Math.max(result,sum);
           return;
       }

       for(int i=0;i<ar.length;i++){
           if(!visited[i]){
               visited[i]=true;
               ans[depth]=ar[i];
               dfs(depth+1);
               visited[i]=false;
           }
       }
    }
}
