class Solution {
    public int numSquares(int n) {
        if(n<=0)return 0;
        
        int[] arr=new int[n+1];
        
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0]=0;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j*j<=i;j++){
                arr[i]=Math.min(arr[i],arr[i-j*j]+1);
            }
        }
        return arr[n];
    }
}