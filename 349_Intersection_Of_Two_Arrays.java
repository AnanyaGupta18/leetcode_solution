class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> temp =new HashSet<>();
        Set<Integer> res =new HashSet<>();
        for(int n : nums1){
            temp.add(n);
        }
        for(int n : nums2){
            if(temp.contains(n)){
                res.add(n);
            }
        }
        int size = res.size();
        int[] ans = new int[size];
        int i =0;
        for(int n : res){
            ans[i++] = n;
        }        
        return ans;
    }
}
