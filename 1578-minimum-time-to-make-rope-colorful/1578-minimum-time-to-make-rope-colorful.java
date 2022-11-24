class Solution {
    public int minCost(String s, int[] cost1) {
        int n=s.length();
        int res=0;
        int maxC=0;
        int cost=0;
        
        for(int i=0;i<n;i++){
            if(i>0 && s.charAt(i)!=s.charAt(i-1)){
                res += cost - maxC;
               cost = maxC = 0;
            }
            cost += cost1[i];
            maxC = Math.max(maxC, cost1[i]);
        }
        res += cost - maxC;
        return res; 
            }
        }
    
