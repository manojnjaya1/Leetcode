class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        
        int[] dp=new int[target+1];
     Arrays.fill(dp,-1);
       
        return solve(nums,target,dp);
    }
    int solve(int[] nums,int tar,int[] dp){
       if(tar==0) return 1;
        if(tar<0)return 0;
        int ans=0;
        if(dp[tar]!=-1)return dp[tar];
       for(int i=0;i<nums.length;i++){
          
          ans+=solve(nums,tar-nums[i],dp);
       }
        dp[tar]=ans;
        return ans;
    }
}