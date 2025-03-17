class Solution {
    public boolean divideArray(int[] nums) {
        boolean flag = true;
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int n : nums){
            temp.put(n , temp.getOrDefault(n,0)+1);
        }
        for(int count : temp.values()){
            if(count % 2 != 0){
                flag = false;
            }
        }
        return flag;
    }
}
