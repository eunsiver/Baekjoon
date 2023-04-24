import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        Map<Integer, Integer> map=new HashMap<>();

        String s= br.readLine();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i)-'0',map.getOrDefault(s.charAt(i)-'0',0)+1);
        }
        int max=Integer.MIN_VALUE;
        int sum69=0,k=0;
        for(int i:map.keySet()){
            if(i==6||i==9){
                k+=map.get(i);
            }
            else max=Math.max(max,map.get(i));
        }
        sum69=k/2+k%2;
        max=Math.max(max,sum69);

        System.out.println(max);

    }
}
