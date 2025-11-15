class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int sqrt = (int)Math.sqrt(total);
        if (sqrt * sqrt == total) {
            return sqrt;
        }
        return -1;
    }
}
