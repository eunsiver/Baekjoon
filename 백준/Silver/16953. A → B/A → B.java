
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int cnt=0;
        Queue<Long> q = new LinkedList<>();
        q.add(a);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                long tmp = q.poll();
                if(tmp==b){
                    System.out.println(cnt+1);
                    return;
                }
                if(tmp*2<=b) q.add(tmp*2);
                if(tmp*10+1<=b) q.add(tmp*10+1);
            }
            cnt++;
        }
        System.out.println(-1);
    }
}

