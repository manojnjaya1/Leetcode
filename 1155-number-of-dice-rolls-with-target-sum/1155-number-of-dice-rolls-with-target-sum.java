class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp=new int[n+1][target+1];
        
    for(int[] row:dp)Arrays.fill(row,-1);
      return solve(n,k,target,dp)  ;
    }
    int solve(int dice,int faces, int target,int[][] dp){
        if(dice==0 && target!=0)return 0;
        if(dice!=0 && target==0)return 0;
        if(target<0)return 0;
        if(dice==0 && target ==0)return 1;
        if(dp[dice][target]!=-1)return dp[dice][target];
        int ans=0;
        for(int i=1;i<=faces;i++){
            ans=(ans+solve(dice-1,faces,target-i,dp))%1000000007;
        }
                 return dp[dice][target] =ans;
    }
}