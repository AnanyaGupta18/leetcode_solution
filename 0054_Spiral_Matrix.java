class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        if(matrix == null || m == 0){
            return res;
        }
        int t = 0; //top
        int b = m - 1; //bottom
        int l = 0; //left
        int r = n - 1; //right

        while(t <= b && l <= r){
            for(int i = l; i <= r;i++){
                res.add(matrix[t][i]);
            }
            t++;
            for(int j = t ; j <= b ;j++){
                res.add(matrix[j][r]);
            }
            r--;
            if(t <= b){
                for(int i = r ; i >= l ; i--){
                    res.add(matrix[b][i]);
                }
                b--;
            }

            if(l <= r){
                for(int j = b ; j >= t; j--){
                    res.add(matrix[j][l]);
                }
                l++;
            }
        }
        return res;
        // for(int j = 0; j < n ; j++){
        //     res.add(matrix[0][j]);
        // }
        // for(int i = 1 ; i < m;i++){
        //     res.add(matrix[i][n-1]);
        // }
        // for(int j = 2 ; j >= 0; j--){
        //     res.add(matrix[m-1][j]);
        // }
        // for(int j = 0 ; j < n-1 ; j++){
        //     res.add(matrix[m-2][j]);
        // }
        
        // int x = m*n;
        // for(int i = 0; i < x ; i++){
        //     for(int j = 0; j < x ; j++){
        //         if(res.get(i) == res.get(j)){
        //             res.remove(i);
        //         }
        //     }
        // }
        // return res;
    }
}
