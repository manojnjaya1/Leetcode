class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        int n=nums.length;
       
        int i=0;
        Arrays.sort(nums);
        
        for(int j=n-n/2;j<n;j++){
            i+=2*nums[i]<=nums[j]?1:0;
        }
        return 2*i;
        
        
    }
}