class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                temp.add(i);
            }
        }
        if(temp.size() < k){
            return -1;
        }   
        return temp.get(k-1);
    }
}
