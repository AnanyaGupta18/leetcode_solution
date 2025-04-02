class Solution {
    public int maxProfit(int[] prices) {
        int p = 0; //profit
        int val = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i = 0 ;i < n ; i++){
            if(prices[i] < val){
                val = prices[i];
            } else if (prices[i] - val > p){
                p = prices[i] - val;
            }
        }
        return p;
    }
}
