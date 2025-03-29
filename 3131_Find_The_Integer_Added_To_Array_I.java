class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums1.length ; i++){
            res = nums2[i] - nums1[i];
        }
        return res;
    }
}
