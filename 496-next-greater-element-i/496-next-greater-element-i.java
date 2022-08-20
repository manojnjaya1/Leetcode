class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[n1];
        for(int i=0;i<n2;i++){
            map.put(nums2[i],i);
        }
        
        for(int i=0;i<n1;i++){
            int k=map.get(nums1[i]);
            
           while(k<n2){
                if(nums2[k]>nums1[i]){
                    ans[i]=nums2[k];
                    break;
                }
               k++;
                
            }
            if(k==n2)ans[i]=-1;
        }
        return ans;
        
    }
}