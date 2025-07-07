class Solution {
    public int maxPower(String s) {
        int cmax = 1;
        int count = 1;
        for(int i = 0; i < s.length()-1; i++){            
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else {
                count = 1;
            }
            cmax = Math.max(cmax, count);
        }
        return cmax;
    }
}
