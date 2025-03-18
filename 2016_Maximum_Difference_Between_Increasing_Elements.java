class Solution {
    public int maximumDifference(int[] nums) {
        int val = nums[0];  
        int res = -1;     

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > val) {
                res = Math.max(res, nums[i] - val);
            } else {
                val = Math.min(val, nums[i]);  
            }
        }
        return res;
    }
}
