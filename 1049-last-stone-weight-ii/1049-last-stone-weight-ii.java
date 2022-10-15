class Solution {
    public int lastStoneWeightII(int[] stones) {
       int n=stones.length;
        int target=0;
        for(int s:stones)target+=s;
        boolean[] dp =new boolean[target/2+1];
        dp[0]=true;
        int maxS=0;
        for(int s:stones){
            boolean[] cur=dp.clone();
            for(int st=s;st<=target/2;st++){
                if(dp[st-s]){
                    cur[st]=true;
                    maxS=Math.max(st,maxS);
                    if(maxS==target/2)return target-2*maxS;
                }
            }
            dp=cur;
        }
        return target-2*maxS;
    }
}