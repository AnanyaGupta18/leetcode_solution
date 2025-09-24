class Solution {
    public int alternateDigitSum(int n) {
        String digits = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            result += (i % 2 == 0) ? digit : -digit;
        }
        return result;
    }
}
