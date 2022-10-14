class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length/2;
        int minc=0;
        int idx=0;
        int[] refund=new int[2*n];
        for(int[] cost:costs){
            refund[idx++]=cost[1]-cost[0];
            minc+=cost[0];
        }
        Arrays.sort(refund);
        for(int i=0;i<n;i++){
            minc+=refund[i];
        }
        return minc;
    }
}