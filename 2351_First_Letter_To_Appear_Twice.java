class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> temp = new HashSet<>();
        for(char i : s.toCharArray()){
            if(temp.contains(i)){
                return i;
            }
            temp.add(i);
        }
        return ' ';
    }
}
