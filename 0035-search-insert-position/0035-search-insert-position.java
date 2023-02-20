class Solution {
    public int searchInsert(int[] nums, int target) {
       int n=nums.length;
        if(target>nums[n-1])return n;
        if(target<nums[0])return 0;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        return r+1;
    }
}