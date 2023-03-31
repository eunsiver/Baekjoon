import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String [] args) throws IOException {
        List<String> set=new ArrayList<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String []a=br.readLine().split(" ");
        int setN=Integer.parseInt(a[0]);
        int checkN=Integer.parseInt(a[1]);

        Map<String, Integer> map=new HashMap<>();

        for(int i=0;i<setN;i++){
            map.put(br.readLine(),0);
        }
        int count=0;
        for(int i=0;i<checkN;i++){
            if(map.containsKey(br.readLine()))count++;
        }
        System.out.println(count);
    }
}
