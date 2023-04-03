import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException {

        class Node {
            private int x;
            private int a;

            Node(int x, int a){
                this.x=x;
                this.a=a;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Node [] nodes= new Node[n];

        long total_people=0;

        for (int i = 0; i < n; i++) {
            String[] a = br.readLine().split(" ");
            nodes[i]=new Node(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
            total_people+=nodes[i].a;
        }

        long k=(total_people+1)/2;
        Arrays.sort(nodes,(o1,o2)->o1.x==o2.x? o1.a-o2.a:o1.x-o2.x);

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum+=nodes[i].a;
            if(sum>=k){
                System.out.println(nodes[i].x);
                break;
            }
        }
    }
}
