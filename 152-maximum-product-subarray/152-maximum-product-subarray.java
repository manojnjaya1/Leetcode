class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int p=nums[0];
       
        for(int i=0;i<n-1;i++){
            int prd=nums[i];
            if(prd>p)p=prd;
            for(int j=i+1;j<n;j++){
                if(nums[j]>p)p=nums[j];
                prd*=nums[j];
                if(prd>p)p=prd;
            }
        }
        return p;
    }
}