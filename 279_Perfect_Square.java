class Solution {
    public int numSquares(int n) {
         int dp[] = new int[n+1];
         for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
         return sumHelp(n,dp);
         
    }
    private int sumHelp(int n, int[] dp){
        if(n == 0) return 0;

        if(dp[n] != -1){
           return dp[n];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n ;i++){
           min = Math.min(min, sumHelp(n - i*i, dp));
        }
        dp[n] = min + 1;
        return dp[n];
    }
}
