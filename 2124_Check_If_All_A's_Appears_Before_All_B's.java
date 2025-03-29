class Solution {
    public boolean checkString(String s) {
        int count = 0;
        boolean flag = true;
        for(int i = 0 ;i < s.length()-1 ; i++){
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                flag = false;
            }
        }
        return flag;
    }
}
