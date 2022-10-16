class Solution {
    public int trailingZeroes(int n) {
      /*  if(n<5)return 0;
        int an=0;
        for(int i=1;i<=8;i++){
         if(n/Math.pow(5,i)>0)   {
             an+=n/Math.pow(5,i);
         }else break;
        }
       return an;*/
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}