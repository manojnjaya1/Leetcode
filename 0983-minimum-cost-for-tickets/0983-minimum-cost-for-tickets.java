class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp=new int[days.length];
        Arrays.fill(dp,-1);
        int ans=rec(days,costs,0,dp);
        return ans;
    }
    int rec(int[] days,int[] costs,int ind,int[] dp){
        if(ind>=days.length)return 0 ;
        if(dp[ind]!=-1)return dp[ind];
        int op1=costs[0]+rec(days,costs,ind+1,dp);
        
        int k=ind;
        for(;k<days.length ;k++){
            if(days[k]>=days[ind]+7)break;
        }
        int op2=costs[1]+rec(days,costs,k,dp);
         k=ind;
        for(;k<days.length ;k++){
            if(days[k]>=days[ind]+30)break;
        }
                int op3=costs[2]+rec(days,costs,k,dp);
        dp[ind] =Math.min(op1,Math.min(op2,op3));
        return Math.min(op1,Math.min(op2,op3));

    }
}