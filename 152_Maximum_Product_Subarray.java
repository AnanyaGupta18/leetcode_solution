class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int res = nums[0];
        int maxp = nums[0];
        int minp = nums[0];

        for(int i = 1; i < nums.length; i++){
            int t1 =  Math.max(maxp * nums[i] , minp * nums[i]);
            int t2 =  Math.min(maxp * nums[i] , minp * nums[i]);

            maxp = Math.max(nums[i], t1);
            minp = Math.min(nums[i], t2);
            
            res = Math.max(maxp , res);           
        }
        return res;
    }
}
