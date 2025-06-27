class Solution {
    public int valueAfterKSeconds(int n, int k) {
      int mod = 1000000007;
      int[] arr = new int[n];
      Arrays.fill(arr,1);
      for(int x = 1 ; x <= k ; x++){
        for(int i = 1; i < n; i++){
          arr[i] = (arr[i] + arr[i-1]) % mod;
        }
      }
      return arr[n-1];
    }
}
