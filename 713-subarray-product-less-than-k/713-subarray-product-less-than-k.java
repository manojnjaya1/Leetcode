class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int n=nums.length;
     long co=1;
        int ans=0;
        int i=0;
        int j=0;
        
        while(j<n){
            co*=nums[j];
            if(co<k){
                ans+=j-i+1;
            }
            else{
                while(co>=k && i<j){
                    co/=nums[i];
                    i++;
                }
                if(co<k){
                 ans+=j-i+1;
            }
            }
            j++;
            
        }
        return ans;
    }
}