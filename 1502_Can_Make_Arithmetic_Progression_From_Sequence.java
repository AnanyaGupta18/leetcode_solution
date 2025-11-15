class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int size = arr.length;
        Arrays.sort(arr);
        for(int i = 0 ; i < size-2 ; i++){
            if(Math.abs(arr[i] - arr[i + 1]) != Math.abs(arr[i+1] - arr[i+2])){
                return false;
            }
        }
        return true;
    }
}
