class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int n1 = n * 2;
        int[] ans = new int[n1];
        for(int i = 0; i < n ; i++){
            ans[i] = nums[i];
        }
        for(int i = 0; i < n ; i++){
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
