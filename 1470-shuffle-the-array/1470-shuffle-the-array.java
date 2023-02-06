class Solution {
    public int[] shuffle(int[] nums, int n) {
         int[] ans=new int[2*n];
        
        
        for(int i=0;i<2*n;i+=2)   
     {
          ans[i]=nums[i/2];
     
        }
           for(int i=1;i<2*n;i+=2)   
     {
          ans[i]=nums[i/2+n];
     
        }
        return ans;
    }
    
}