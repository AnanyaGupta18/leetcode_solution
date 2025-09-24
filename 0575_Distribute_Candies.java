class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Arrays.sort(candyType);
        ArrayList<Integer> t = new ArrayList<>();
        t.add(candyType[0]);
        for(int i = 0 ; i < n - 1; i++){
            if(candyType[i] != candyType[i+1]){
                t.add(candyType[i+1]);
            }
        }
        if(n/2 == t.size()) return n/2;
        else if(n/2 > t.size()) return t.size();
        else if(n/2 < t.size()) return n/2;
        
        return 0;
    }
}
