class Solution {
    public boolean canReach(int[] arr, int i) {
        int n=arr.length;
        return 0<=i && i<n && arr[i]>=0 &&((arr[i]=-arr[i])==0||canReach(arr,i+arr[i])||canReach(arr,i-arr[i]) );
    }
   
}