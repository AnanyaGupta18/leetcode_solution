class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        List<Integer> temp = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }else{
                temp.add(arr[i]);
                temp.add(0);
            }
        }
        for(int i = 0 ; i < n ; i++){
            arr[i] = temp.get(i);
        }
        return;
    }
}
