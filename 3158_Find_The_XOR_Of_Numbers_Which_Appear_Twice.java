class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1 ; i++){
            if(nums[i] == nums[i+1]){
                res ^= nums[i];
            }
        }
        return res;
    }
}
