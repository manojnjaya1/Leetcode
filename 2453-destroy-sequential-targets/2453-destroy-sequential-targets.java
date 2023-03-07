class Solution {
    public int destroyTargets(int[] nums, int space) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        
        for(int i:nums){
            int val=i%space;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int maxi=Collections.max(map.values());
        // System.out.println(map.values().toString());
        int ans=Integer.MAX_VALUE;
        for(int i:nums){
            
            if(map.get(i%space)==maxi)ans=Math.min(i,ans);
            if(map.get(i%space)>maxi){
                ans=i;
                maxi=map.get(i);
            }
            
        }
        return ans;
    }
}