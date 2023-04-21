import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        char [] s= br.readLine().toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        StringBuilder sb= new StringBuilder();

        for( char c: s){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char i='a'; i<='z';i++){
           if(map.containsKey(i)) sb.append(map.get(i)).append(" ");
           else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}
