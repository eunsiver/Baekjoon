import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String check = sc.next();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int len = check.length();
        int index;

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));

            //스택의 사이즈가 폭발 문자열의 길이보다 길다면
            //폭발 문자열이 존재할 수 있다.
            if (st.size() >= check.length()) {
                boolean contain = true;//폭발 문자열이 있는지 확인

                //폭발 문자열 길이만큼 반복
                for (int j = 0; j < check.length(); j++) {
                    //스택의 길이 - 폭발 문자열의 길이를 빼고 거기서 부터 시작
                    //폭발 문자열과 다르면 탈출
                    if (st.get(st.size()- check.length() + j) != check.charAt(j)) {
                        contain = false;
                        break;
                    }
                }
                if (contain) {
                    for (int j = 0; j < check.length(); j++) {
                        st.pop();
                    }
                }
            }

        }
        for(Character c : st) {
            sb.append(c);
        }
        System.out.println(sb.length() == 0? "FRULA" : sb.toString());
    }
}
