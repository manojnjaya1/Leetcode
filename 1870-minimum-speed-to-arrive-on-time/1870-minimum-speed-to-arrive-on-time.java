class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
       int l=1;
        int h=10000000;
        int ans=-1;
        
    
       while(l<=h){
           int mid=(l+h)/2;
           double sum=0;
           for(int i=0;i<n-1;i++){
               sum += Math.ceil( ( (double) dist[i]) /mid);
           }
           sum +=  ( (double) dist[n-1]) /mid;
           
           if(sum > hour){
                l = mid+1;
            }else{
                ans = mid;
                h = mid-1;
            }
       }
        
        return ans;
        /*
         int n = dist.length;
        int min = 1, max = 10000000;
        int ans = -1;
        while(min <= max){
            int mid = (max + min)/2;
            double sum = 0;
            for(int i = 0; i<n-1; ++i){
                sum += Math.ceil( ( (double) dist[i]) /mid);
            }
            sum = sum + ( ( (double) dist[n-1]) /mid);
            if(sum > hour){
                min = mid+1;
            }else{
                ans = mid;
                max = mid-1;
            }
        }
        return ans;*/
    }
}