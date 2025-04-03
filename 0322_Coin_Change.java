class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        for(int i = 0; i <= amount ;i++){
            dp[i] = -1;
        }
        int res = help(coins, amount, dp);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    private int help(int[] coins, int amount, int[] dp){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount] != -1){
            return dp[amount];
        }
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int r = help(coins, amount - coin, dp);

            if (r != Integer.MAX_VALUE){
                min = Math.min(min, r + 1);
            }            
        }
        dp[amount] = min;
        return dp[amount];
    }
}
