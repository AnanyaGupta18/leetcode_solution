class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        long n1 = (long)n;
        while(n1!=1){
            if(n1%2 == 0){
                count++;
                n1 = n1/2;
            } else if (((n1 - 1) % 4 == 0) || (n1 == 3)){
                n1 = n1 - 1;
                count++;
            } else{
                n1 = n1 + 1;
                count++;
            }
        }
        return count;
    }
}
