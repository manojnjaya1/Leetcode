class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        
       int res = 0, dp = 0;
        int prev = -1; 
        for (int i = 0; i < A.length; ++i) {
            if (A[i] < L)
                res += dp;
            else if (A[i] > R) {
                dp = 0;
                prev = i;
            } else if (A[i] >= L && A[i] <= R) {
                dp = i - prev;
                res += dp;
            }
        }
        return res;
    }
}