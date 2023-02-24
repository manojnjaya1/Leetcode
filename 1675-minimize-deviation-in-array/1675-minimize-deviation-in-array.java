class Solution {
    public int minimumDeviation(int[] nums) {
        int n=0;
        int mini=Integer.MAX_VALUE;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:nums){
            if(i%2==1)i*=2;
            mini=Math.min(mini,i);
            pq.offer(i);
            
        }
        
        int diff=Integer.MAX_VALUE;
        
        while(pq.peek()%2==0){
            int maxi=pq.poll();
            diff=Math.min(diff,maxi-mini);
            mini=Math.min(mini,maxi/2);
            pq.add(maxi/2);
        }
        
        return Math.min(diff,pq.peek()-mini);

}
}