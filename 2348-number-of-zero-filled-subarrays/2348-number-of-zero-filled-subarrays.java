class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;

        long count=0;
        long ans=0;
        for(int i=0;i<n;i++){
            
            if(nums[i]==0){
                ans++;
                count+=ans;
            }else {
               ans=0;
                }
            }
        
        return count;
    }
}