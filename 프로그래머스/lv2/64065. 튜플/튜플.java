import java.util.*;
class Solution {
    public int[] solution(String s) {

        s=s.substring(1,s.length()-1);
        String ss[]=s.split("},");
        for(int i=0;i<ss.length;i++){
            ss[i]=ss[i].replace("{","");
            ss[i]=ss[i].replace("}","");
        }
        LinkedHashSet<Integer> l=new LinkedHashSet<>();
        Arrays.sort(ss,(o1,o2)->o1.length()-o2.length());
        
         for(int i=0;i<ss.length;i++){
             String sn[]=ss[i].split(",");
             for(int j=0;j<sn.length;j++){
                 l.add(Integer.parseInt(sn[j]));
             }
             
         }
       /// for(String si:ss)
       int[] primitive = l.stream()
                            .mapToInt(i->i)
                            .toArray();
       /// Integer[] arr = l.toArray(new Integer[0]);
       
        return primitive;
    }
}