class Solution {
    public int maxSubArray(int[] arr) {
          long sum=Long.MIN_VALUE;
        long cursum=0;
        
        for(int i=0;i<arr.length;i++){
            cursum+=arr[i];
            if(cursum>sum)sum=cursum;
            if(cursum<0)cursum=0;
            
        }
         //sum=Math.max(sum,cursum);
        return (int)sum;
        
    }
}