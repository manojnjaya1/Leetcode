class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int len=q.length;
         int r=Integer.MIN_VALUE;
        for(int i:q)if(i>r)r=i;
        int l=1;
       
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(solve(mid,q,n)){
                //System.out.println("true"+" "+mid);
                r=mid-1;
                ans=mid;
            }
            else{
                           //     System.out.println("false"+" "+mid);

                 l=mid+1;
            }
        }
        return ans;
//           int lo = 1;
//         int hi = (int)1e5;
        
//         int ans = -1;
        
//         while(lo <= hi){
            
//             int mid = (lo + hi)/2;
            
//             if(solve(mid, q, n)){
//                 ans = mid;
//                 hi = mid-1;
//             }else{
//                 lo = mid+1;
//             }
//         }
        
//         return ans;
    }
    
    boolean solve(int mid,int[] q,int n){
        int len=q.length;
        int i=0;
        int count=0;
        while(i<len){
            count+=(q[i]/mid);
            if(q[i]%mid>0)count++;
            i++;
        }
                        // System.out.println(count);

        return count>n?false:true;
    }
}
  // int s = 1;
  //       int e = quantities[0];
  //       for(int i=1; i<quantities.length; i++){
  //           if(quantities[i]>e) e = quantities[i];
  //       }
  //       int ans=0;
  //       while(s<=e){
  //           int m = s+(e-s)/2;
  //           if(isItPossibleToDistribute(m, quantities, n)) {
  //               e=m-1;
  //                ans=m;
  //           }
  //            else  s=m+1; 
  //       }
  //       return ans;
 // int count=0;
 //        for(int i=0; i<nums.length; i++){
 //           int x = nums[i]/m;
 //            if(nums[i]%m !=0) x++;
 //            n -= x;
 //        }
 //        return  n>=0;