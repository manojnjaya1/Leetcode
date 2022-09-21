class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
      int n=nums.length;
        int m=queries.length;
        
        int sum=0;
        int[] arr=new int[m];
        
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)sum+=nums[i];
        }
        for(int j=0;j<m;j++){
            int val=queries[j][0];
            int ind=queries[j][1];
           if(nums[ind]%2==0) 
               sum-=nums[ind];
            nums[ind]+=val;
            if(nums[ind]%2==0)
                sum+=nums[ind];
            
            arr[j]=sum;
                
        }
        return arr;
    }
}