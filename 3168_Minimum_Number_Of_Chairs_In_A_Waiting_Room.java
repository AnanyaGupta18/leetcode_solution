class Solution {
    public int minimumChairs(String s) {
        int e = 0;
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'E'){
                e++;
            }else {
                e--;
            }
            ans = Math.max(e,ans);
        }
        return ans;
    }
}
