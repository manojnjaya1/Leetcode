class Solution {
    public int subarraysDivByK(int[] nums, int k) {
          int n=nums.length;
        int ans=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int it:nums){
            
            sum=((sum+it)%k);
            if(sum<0)sum+=k;
            ans+=map.getOrDefault(sum,0);
            System.out.println(sum);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}