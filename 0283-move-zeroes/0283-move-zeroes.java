class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n-1;i++){
            int j=i;
            if(nums[i]==0){
                while(j<n && nums[j]==0){
                    j++;
                }
                if(i<n && j<n)swap(i,j,nums);
            }
        }
        
    }
    void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}