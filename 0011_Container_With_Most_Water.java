class Solution {
    public int maxArea(int[] height) {
       int minHeight;
       int maxCapacity = 0;
       int i = 0 ;
       int j = height.length - 1;

       while(i < j){
        minHeight = Math.min(height[i], height[j]);
        maxCapacity = Math.max(maxCapacity, minHeight*(j - i));

        while(i < j && height[i] <= minHeight){
            i++;
        }
        while(i < j && height[j] <= minHeight){
            j--;
        }
       }
       return maxCapacity;
    }
}
