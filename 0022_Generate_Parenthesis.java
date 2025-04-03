class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        backtrack(0, 0, n, current, res);
        return res;
    }

    private void backtrack(int openN, int closeN, int n, StringBuilder current, List<String> res) {
        if (openN == n && closeN == n) {
            res.add(current.toString());
            return;
        }

        if (openN < n) {
            current.append("(");
            backtrack(openN + 1, closeN, n, current, res);
            current.deleteCharAt(current.length() - 1);
        }

        if (closeN < openN) {
            current.append(")");
            backtrack(openN, closeN + 1, n, current, res);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
