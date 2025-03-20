class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int n : nums) {
            temp.put(n, temp.getOrDefault(n, 0) + 1);
        }

        int p = 0;
        int l = 0;
        for(int count : temp.values()) {
            p += count / 2;
            l += count % 2;
        }

        return new int[]{p, l};
    }
}
