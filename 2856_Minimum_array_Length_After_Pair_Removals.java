class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int left = 0;
        int right = nums.size()/2;
        int pairs = 0;
        while(right < nums.size()){
            if(nums.get(left) < nums.get(right)){
                pairs++;
                left++;
            }
            right++;
        }
        int res = Math.abs((int)nums.size() - 2 * pairs);
        return res;
    }
}
