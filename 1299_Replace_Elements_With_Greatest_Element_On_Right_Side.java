class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int temp = -1;
        for(int i = n - 1 ; i >= 0 ; i--){
            ans[i] = temp;
            temp = Math.max(arr[i] , temp);
        }
        return ans;
    }
}
