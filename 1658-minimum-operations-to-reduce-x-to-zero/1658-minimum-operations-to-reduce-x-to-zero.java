class Solution {
    public int minOperations(int[] nums, int x) {
        int target=-x;
        int n=nums.length;
        for(int num:nums)target+=num;
        if(target==0)return n;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        int res=Integer.MIN_VALUE;
        
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
            if(map.containsKey(sum-target)){
                res=Math.max(res,i-map.get(sum-target));
            }
            map.put(sum,i);
        }
        return res==Integer.MIN_VALUE?-1:n-res;
    }
}