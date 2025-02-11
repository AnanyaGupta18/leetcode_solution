class Solution {
    public int maxProductDifference(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE; 
        int max1 = 0;
        int min1 = Integer.MAX_VALUE;
      
        int n = nums.length;
      
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > max){
                max1 = max;
                max = nums[i];
            } else if(nums[i] > max1){
                max1 = nums[i];
            }
          
            if(nums[i] < min){
                min1 = min;
                min = nums[i];
            }else if(nums[i] < min1){
                min1 = nums[i];
            }
        }
        int ans = (max * max1) - (min * min1);
        return ans;
    }
}
