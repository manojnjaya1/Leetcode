class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int it:nums){
            sum+=it;
            ans+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}