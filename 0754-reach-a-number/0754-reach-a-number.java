class Solution {
    public int reachNumber(int t) {
        int sum=0;
        int step=0;
        int target=Math.abs(t);
        
        while(sum<target){
            step++;
            sum+=step;
        }
        
        while((sum-target)%2!=0){
            step++;
            sum+=step;
        }
        return step;
    }
}