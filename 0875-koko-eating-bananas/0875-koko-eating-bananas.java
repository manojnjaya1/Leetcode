class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxi=0;
        for(int i:piles){
            maxi=Math.max(maxi,i);
        }
        if(n==h)return maxi;
        int l=1;
        int r=maxi;
        while(l<r){
        int mid=l+((r-l)>>1);
            
            if(canEat(piles,mid,h)){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        return l;
    }
    
    boolean canEat(int[] piles,int mid ,int h){
        int ans=0;
        for(int i=0;i<piles.length;i++){
            ans+=(piles[i]/mid);
            if(piles[i]%mid!=0)ans++;
            
        }
       // System.out.println(ans);
        return ans<=h;
    }
       
}
