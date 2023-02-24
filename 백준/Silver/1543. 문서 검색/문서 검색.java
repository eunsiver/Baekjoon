import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ch = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 0, i = 0;
        String sub;
        while (s.length() - i >= ch.length()) {

            sub = s.substring(i, i + ch.length());
            if (sub.equals(ch)) {
                count++;
                i += ch.length();
            } else i++;
        }

        System.out.println(count);
    }
}