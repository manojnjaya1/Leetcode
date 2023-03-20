class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int l=f.length;
        if(l==1 && f[0]==0){
            n--;
        }
        else {
        for(int i=0;i<l;i++){
         if(f[i]==1)continue;
            
            else if(i==0 && f[i+1]==0){f[i]=1;
                                      n--;
                                      }
            else if(i>0 && i<l){
                if(i<l-1 && f[i-1]==0 && f[i+1]==0){
                    f[i]=1;
                    n--;
                }
                else if(i==l-1 && f[i-1]==0 ){
                    f[i]=1;
                    n--;
                }
            }
        }
        }
        return n<=0;
        
    }
}