class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int a,b,min;
        int max=sizes[0][0]>sizes[0][1]?sizes[0][0]:sizes[0][1];
        int sub=sizes[0][0]<sizes[0][1]?sizes[0][0]:sizes[0][1];
        boolean flag=false;
        
        for(int i=1;i<sizes.length;i++){
            a=sizes[i][0];
            b=sizes[i][1];
            if(max<a){
                max=a;
                sub=b;
            }
            if(max<b){
                max=b;
                sub=a;
            }
            if(max==a){
                if(sub<b)sub=b;
            }
            if(max==b){
                if(sub<a)sub=a;
            }
        }
        for(int i=0;i<sizes.length;i++){
            flag=false;
            a=sizes[i][0];
            b=sizes[i][1];
            
            if(max<=a&&sub<=b||max<=b&&sub<=a){
                flag=true;
                //System.out.println("true: "+"max "+max+" sub "+sub);
            }
            if(!flag){
                min=a<b?a:b;
                if(sub<min)sub=min;
                
            }
        }
        answer=max*sub;
        System.out.println(max*sub);
        return answer;
    }
}