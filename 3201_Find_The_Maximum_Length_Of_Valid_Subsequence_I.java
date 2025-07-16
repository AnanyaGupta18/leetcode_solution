class Solution {
    public int maximumLength(int[] nums) {
        int oc = 0;
        int ec = 0;
        int c = 0;
        boolean flag = nums[0] % 2 == 1;
        for(int n : nums){
            if(n%2 == 1){
                if(flag){
                    flag = !flag;
                    c++;
                }
                oc++;
            } else {
                if(!flag){
                    flag = !flag;
                    c++;
                }
                ec++;
            }
        }
        int res = Math.max(c, Math.max(oc,ec));
        return res;
    }
}
