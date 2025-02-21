class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int max = 0;
        int count = 0;
        for(int i = 0; i < len ; i++){
            boolean[] vis = new boolean[130];
            count = 0;
            for(int j=i ; j < len ; j++){
                if(!vis[arr[j]]){
                    vis[arr[j]] = true;
                    count++;
                    max = Math.max(max, count);
                } else {
                    break;
                }
            }
        }
        return max;
    }
}
