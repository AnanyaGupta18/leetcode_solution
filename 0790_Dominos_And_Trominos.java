class Solution {
    public int numTilings(int n) {
        int MOD = 1000000007;
        long[] dp = new long[n + 3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 5;

        for (int i = 3; i < n; i++)
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % MOD;

        return (int)dp[n - 1];
    }
}
