class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum1 = 0;

        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
        }
        for(int i = 0; i <= n ; i++){
            sum1+= i;
        }
        return sum1 - sum;
    }
}
