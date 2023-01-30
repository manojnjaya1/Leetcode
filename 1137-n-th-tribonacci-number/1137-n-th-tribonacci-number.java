class Solution {
    public int tribonacci(int n) {
          int prev2=0;
        if(n==0)return 0;
        int prev1=1;
        if(n==1 || n==2)return 1;
        int prev=1;
        for(int i=3;i<=n;i++){
            int cur=prev2+prev1+prev;
            prev2=prev1;
            prev1=prev;
            prev=cur;
        }
        
    return prev;
    }
}