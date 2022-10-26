class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int a:nums)pq.add(a);
        
        while(!pq.isEmpty()){
            int in=pq.poll();
            
            for(int i=1;i<k;i++){
                if(pq.remove(in+i))continue;
                else return false;
            }
        }
        
        return true;
    }
}