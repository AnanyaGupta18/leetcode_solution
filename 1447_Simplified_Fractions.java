class Solution {
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        String res = "";
        for(int de = 2 ; de <= n ; de++){
            for(int nu = 1 ; nu < de ; nu++){
                if(gcd(nu,de) == 1){
                    ans.add(nu + "/" + de);
                }
            }     
        }
        return ans;
    }
}
