class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int max = 0;
        int n = temperatures.length;
        int[] res = new int[n];
        
//BRUTE FORCE APPROACH - GIVES TLE 
        // for(int i = 0; i < n ; i++){
        //     for(int j = i+1; j < n ; j++){
        //         if(temperatures[i] < temperatures[j]){
        //             res[i] = (j-i);
        //             break;
        //         }
        //     }
            
        // }
//OPTIMIZED
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for(int i = 1; i < n ; i++){
            while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                res[stk.peek()] = i-stk.peek();
                stk.pop();
            }
            stk.push(i);
        }
        return res;
    }
}
