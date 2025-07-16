class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int md = 0;
        int ma = 0;
        for(int[] rec : dimensions){
            int l = rec[0];
            int w = rec[1];
            int d = l*l + w*w;
            int a = l*w;
            if(d > md || ((d == md) && (a > ma))){
                md = d;
                ma = a;
            }
        }
        return ma;
    }
}
