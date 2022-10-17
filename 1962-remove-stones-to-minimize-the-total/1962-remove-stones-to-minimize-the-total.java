class Solution {
    public int minStoneSum(int[] piles, int k) {
        int n=piles.length;
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:piles){
            sum+=a;
            pq.add(a);
            
        }
        while(k>0){
            int a=pq.poll();
            sum-=a/2;
            pq.add(a-a/2);
            
            k--;
            
        }
        return sum;
    }
}