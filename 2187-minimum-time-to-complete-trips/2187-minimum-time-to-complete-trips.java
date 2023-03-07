class Solution {
    public long minimumTime(int[] time, int tTrips) {
        int n=time.length;
        int maxi=time[0];
        for(int i=1;i<n;i++){
            maxi=Math.min(maxi,time[i]);
        }
        long l=maxi;
  long r=(long)maxi*tTrips;
        
            while(l<r){
                long mid=(l+r)/2;
                if(trips(time,tTrips,mid)){
                   
                     r=mid;
                }else 
                {
                   l=mid+1;
                }
            }
        return l;
    }
    boolean trips(int[] time,int k,long mid){
        long trip=0;
        for(int i=0;i<time.length;i++){
            trip+=mid/time[i];
           
        }
        return trip>=k;
    }
//      public boolean timeEnough(int[] time, long givenTime, int totalTrips) {
//         long actualTrips = 0;
//         for (int t : time) 
//             actualTrips += givenTime / t;
//         return actualTrips >= totalTrips;
//     }
    
//     public long minimumTime(int[] time, int totalTrips) {
//         // Initialize the left and right boundaries.
//         int max_time = 0;
//         for (int t : time) {
//             max_time = Math.max(max_time, t);
//         }
//         long left = 1, right = (long) max_time * totalTrips;

//         // Binary search to find the minimum time to finish the task.
//         while (left < right) {
//             long mid = (left + right) / 2;
//             if (timeEnough(time, mid, totalTrips)) {
//                 right = mid;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         return left;
//     }
}