class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int gs = 0;
        int cs = 0;
        int ans = 0;
        int temp = 0;
        for(int i = 0; i < n ; i++){
            gs += gas[i];
            cs += cost[i];
        }
        if(gs < cs){
            return -1;
        }
        for(int i = 0 ; i < n ; i++){
            temp += gas[i] - cost[i];
            if(temp < 0){
                temp = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
}
