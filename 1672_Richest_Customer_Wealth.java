class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi = accounts[0][0];
        for(int temp[] : accounts){
            int sum = 0;
            for(int i : temp){
                sum += i;
            }
            maxi = Math.max(maxi , sum);
        }
        return maxi;
    }
}
