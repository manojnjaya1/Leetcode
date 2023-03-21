class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;

        long count=0;
        long ans=0;
        for(int i=0;i<n;i++){
            
            if(nums[i]==0){
                count++;
            }else {
                if(count!=0){
                    ans+=(count*(count+1))/2;
                    count=0;
                }
            }
        }
        if(count>0)ans+=(count*(count+1))/2;
        return ans;
    }
}