class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo=new int[n+1];
        Arrays.fill(memo,-1);
        return backtracking(n);
    }
    int backtracking(int n){
        if(n==1 || n==2) return n;
        if(memo[n]!=-1) return memo[n];
        return memo[n]=backtracking(n-1)+backtracking(n-2);
    }
}