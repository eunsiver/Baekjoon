import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

class Solution {
    
    private static List<String> li = new ArrayList<String>();
    private static String ar[]= {"A","E","I","O","U"};
    
    public int solution(String word) {
        
        int answer = 0;
        
        recur("",0);
        
        for(int i=0;i<li.size();i++){
            if(li.get(i).equals(word)){
                answer=i;
                break;
            }
        }
        
        return answer;
    }
    public void recur(String str, int depth){
        li.add(str);
        
        if(depth==5)return;
    
        for(String s: ar){
            recur(str+s, depth+1);
        }
    }
}       /*rr 배열에 있는 알파벳들을 순회하면서, 
        현재까지 생성된 str에 각 알파벳을 추가하여 새로운 단어를 만들고 이를
        재귀적으로 메서드에 전달한다.
        
        depth가 5이면 종료 시키고 재귀적으로 모든 가능한 단어를 생성하면,
        list에는 사전 순서대로 모든 단어들을 저장한다.
        */