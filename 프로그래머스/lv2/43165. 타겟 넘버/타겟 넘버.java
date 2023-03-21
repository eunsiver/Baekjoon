class Solution {
    int result = 0;
    int [] num;
    int target;
    
    public int solution(int[] numbers, int target) {
        this.num=numbers;
        this.target=target;
        
        
        dfs(0, 0);
        return result;
    }

    private void dfs(int index, int sum) {
        if(index == num.length) {
            if(target == sum) {
                result++;
            }
            return;
        }
        dfs(index + 1, sum + num[index]);
        dfs(index + 1, sum - num[index]);
    }
}