class Solution {
    public int mostFrequentEven(int[] nums) {
      Arrays.sort(nums);
        int n=nums.length;
        
        int i=0;
        int ans=-1;
        for(int l=0;l<n ;l++){
            if(nums[l]%2==0){
                ans=l;
                break;
            }
        }
        if(ans==-1)return -1;
        int maxc=0;
        while(i<n){
            int count =1;
            while(i<n && nums[i]%2!=0){
               
                i++;
            }
            
            //int k=i;
            int j=i+1;
            while(i<n-1 && j<n && nums[i]%2==0 && nums[i]==nums[j]){
                count++;
                
                if(count>maxc){
                    maxc=count;
                    ans=i;
                }
                i++;
                j++;
            }
            i++;
            
        }
        return ans==-1?-1:nums[ans];
    }
}