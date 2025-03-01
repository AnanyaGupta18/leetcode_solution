class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int x = 0;
        for (int num : nums) {
            if (num != 0) {
                res[x++] = num;
            }
        }
        return res;
    }
}
