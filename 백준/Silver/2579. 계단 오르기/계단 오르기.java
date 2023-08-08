
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] DP = new int[N + 1];
        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] =in.nextInt();
        }

        // index = 0 은 시작점이므로 0이다.
        DP[1] = arr[1];

        // N 이 1이 입력될 수도 있기 때문에 예외처리를 해줄 필요가 있다.
        if (N >= 2) {
            DP[2] = arr[1] + arr[2];
        }

        for(int i=3;i<=N;i++){
            DP[i]=Math.max(DP[i-2],DP[i-3]+arr[i-1])+arr[i];
        }
        System.out.println(DP[N]);

    }
}
//1. 한 계단, 두 계단만 가능
//        2. 연속 3계단 불가
//
//        - 마지막 칸의 계단은 무조건 밟아야 하므로 2가지 중 큰 값 + 현재 계단의 값을 더한 값
//
//        ar[i-1]을 해주는 이유? 밟은 상태인지를 확신할 수 없기 때문에
//        dp[i]=Math.max(dp[i-3]+ar[i-1],dp[i-2])+ar[i];
