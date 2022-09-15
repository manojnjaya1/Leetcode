class Solution {
    public int distinctSubseqII(String s) {
        int n=s.length();
        int MOD=1000000007;
      int [] dp=new int[n+1];
        dp[0]=1;
        
        Map<Character,Integer> map=new HashMap<>();
        for(int i=1;i<dp.length;i++){
            char ch=s.charAt(i-1);
            dp[i]=(dp[i-1]*2 %MOD );
            if(map.containsKey(ch)){
                dp[i]=(dp[i]%MOD-dp[map.get(ch)-1]+MOD)%MOD;
            }
            map.put(ch,i);
        }
        return dp[n]-1;
//(res * 2 % MOD - end[c - 'a'] + MOD) % MOD;
    }
}