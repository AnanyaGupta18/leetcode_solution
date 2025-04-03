class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] tempr = new int[n];
        int[] templ = new int[n];

        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < n ;i++){
            leftSum += nums[i];
            templ[i] = leftSum;
        }
        for(int i = n - 1; i >= 0 ; i--){
            rightSum += nums[i];
            tempr[i] = rightSum;
        }
        for(int i = 0; i < n; i++){
            if(templ[i] == tempr[i]){
                return i;
            }
        }
        return -1;
    }
}
