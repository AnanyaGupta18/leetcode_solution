class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int result = 0;
        int size = cost.length;
        for(int i = 0; i < size ; i++){
            if(i % 3 != size % 3){
                result += cost[i];
            }
        }
        return result;
    }
}
