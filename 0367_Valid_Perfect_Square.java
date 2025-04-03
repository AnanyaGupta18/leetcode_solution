class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;

        while(low <= high){
            int mid = low + (high - low)/2;
            long val = (long) mid*mid;

            if (val == num){
                return true;
            } else if(val < num){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
