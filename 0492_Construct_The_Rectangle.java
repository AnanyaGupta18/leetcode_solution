class Solution {
    public int[] constructRectangle(int area) {
        int f1 = (int) Math.sqrt(area);
        while(area % f1 != 0){
            f1--;
        }
        int f2 = area/f1;
        int res[] = {f2,f1};
        return res;
    }
}
