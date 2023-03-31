import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) throws IOException {
        List<String> set=new ArrayList<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String []a=br.readLine().split(" ");
        int setN=Integer.parseInt(a[0]);
        int checkN=Integer.parseInt(a[1]);

        for(int i=0;i<setN;i++){
            set.add(br.readLine());
        }

        int count=0;

        for(int i=0;i<checkN;i++){
            if(set.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
      
    }
}
