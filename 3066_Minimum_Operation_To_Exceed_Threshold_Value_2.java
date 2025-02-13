class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        
        for(int i=0; i<nums.length; i++){
            pq.add((long)nums[i]);
        }

        long x,y;
        while(pq.peek()<k){
            x=pq.poll();
            if(!pq.isEmpty()){                
                y=pq.poll();
                pq.add((long)x*2+y);
                count++;
            }else{
                break;
            }            
        }
        return count;
    }
}
