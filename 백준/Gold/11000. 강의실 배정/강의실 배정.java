import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][]times=new int[N][2];
        for(int i=0;i<N;i++){
            times[i][0]=sc.nextInt();
            times[i][1]=sc.nextInt();
        }

        Arrays.sort(times,(o1,o2)->o1==o2?o1[1]-o2[1]:o1[0]-o2[0]);
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int start=times[i][0];
            int end=times[i][1];

            if(!queue.isEmpty()&&queue.peek()<=start){
                queue.poll();
            }
            queue.offer(end);
        }
        System.out.println(queue.size());
    }
}