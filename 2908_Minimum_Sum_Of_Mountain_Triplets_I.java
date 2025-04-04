class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int mini = Integer.MAX_VALUE;
        boolean f = false;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                for(int k = j+1 ; k < n ; k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                        sum = nums[i] + nums[j] + nums[k];
                        mini = Math.min(sum , mini);
                        f = true;
                    }
                }
            }
        }
        return f ? mini : -1;
    }
}
