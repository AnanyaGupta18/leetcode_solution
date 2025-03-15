class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                count = 0;
            } else {
                count++;
            }
            result=Math.max(count, result);
        }
        return result;
    }
}
