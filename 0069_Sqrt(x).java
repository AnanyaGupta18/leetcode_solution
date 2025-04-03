class Solution {
    public int mySqrt(int x) {
        if(x==0 || x == 1){
            return x;
        }
        int low = 1;
        int high = x;
        int ans = 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            long temp =(long) mid * mid;
            if(temp <= x){
                ans = mid;
                low = mid + 1;   // Looks for larger values
            }else {
                high = mid - 1;  // Looks for smaller values
            }
        }
        return ans;
    }
}
