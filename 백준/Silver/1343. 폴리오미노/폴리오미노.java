import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc= new Scanner(System.in);
       String s=sc.next();

       String res="";
       res= poliomino(s);

        System.out.println(res);
    }
    private static String poliomino(String s){
        s=s.replaceAll("XXXX","AAAA");
        s=s.replaceAll("XX","BB");

        if(s.contains("X")){
            return "-1";
        }
        return s;
    }
}