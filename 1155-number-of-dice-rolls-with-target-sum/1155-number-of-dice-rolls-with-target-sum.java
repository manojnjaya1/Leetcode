class Solution {
    public int numRollsToTarget(int n, int k, int t) {
        int[][] dp=new int[n+1][t+1];
        dp[0][0]=1;
        for(int dice=1;dice<=n;dice++){
            for(int target=1;target<=t;target++){
                int ans=0;
        for(int i=1;i<=k;i++){
            if(target-i>=0)
            ans=(ans+dp[dice-1][target-i])%1000000007;
        }
                dp[dice][target] =ans;
            }
        }
        return dp[n][t];
   // for(int[] row:dp)Arrays.fill(row,-1);
     // return solve(n,k,target,dp)  ;
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