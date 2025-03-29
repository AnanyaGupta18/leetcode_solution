class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int j =0;
        int m = spaces.length;
        for(int i = 0 ; i < s.length(); i++){
            if(j < m && i == spaces[j]){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
