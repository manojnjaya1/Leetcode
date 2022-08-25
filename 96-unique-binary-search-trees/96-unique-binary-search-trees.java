class Solution {
    public int numTrees(int n) {
        if(n==0 || n==1)return 1;
        int trees=0;
        int[] a=new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=n;i++){
            int l=0;
            int r=i-1;
           while(l<=i-1){
               a[i]+=(a[l]*a[r]);
               l++;
               r--;
           }
        }
        return a[n];
    }
}