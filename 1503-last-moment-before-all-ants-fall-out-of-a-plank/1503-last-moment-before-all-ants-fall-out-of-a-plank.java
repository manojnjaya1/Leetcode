class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int res=0;
        for(int i:left){
            res=Math.max(i,res);
        }
         for(int i:right){
            res=Math.max(n-i,res);
        }
        return res;
    }
}