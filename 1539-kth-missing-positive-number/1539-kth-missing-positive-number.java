class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans=1;
        int n=arr.length;
        int count=0;
        int i=0;
        while(i<n && count<k){
            if(arr[i]==ans){
                i++;
                ans++;
            }
            else{
                ans++;
                count++;
                if(count==k)return ans-1;
            }
        }
        while(count<k){
            ans++;
            count++;
        }
        return ans-1;
    }
}