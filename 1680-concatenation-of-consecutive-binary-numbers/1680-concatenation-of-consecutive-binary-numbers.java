class Solution {
    public int concatenatedBinary(int n) {
        int length=0;
    long res=1;
        
        
        
        for(int i=2;i<=n;i++){
            length=((int)(Math.log(i)/Math.log(2)))+1;
            res=((res<<length)+i)%1000000007;
        }
        return (int)res;
    }
}