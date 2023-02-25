class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        int profit=0;
        int a=Integer.MAX_VALUE;
        
        
        for(int i=0;i<n;i++){
            if(prices[i]<a)a=prices[i];
            
            profit=prices[i]-a;
            ans=Math.max(ans,profit);
        }
        return ans;
    }
    
}