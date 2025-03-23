class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        Set<Character> temp = new HashSet<>();
        for(int i = 0; i < n; i++){
            temp.add(sentence.charAt(i));
        }
        return temp.size() == 26;
    }
}
