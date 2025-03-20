class Solution {
    public String arrangeWords(String text) {
        String[] temp = text.split(" ");
        Arrays.sort(temp, (a, b) -> a.length() - b.length());
        String res = " ";

        res = res.join(" ", temp);
        res = res.substring(0,1).toUpperCase() + res.substring(1).toLowerCase();

        return res;
    }
}
