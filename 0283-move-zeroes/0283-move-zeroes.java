class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int ss=0;
        for(int i=0;i<n;i++){
           
            if(nums[i]==0){
                ss++;
            } else if(ss>0){
                int t=nums[i];
                nums[i]=0;
                nums[i-ss]=t;
            }
               
            
        }
        
    }
   
}