class Solution {
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        
        Map<Long,List<Long>> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            long fill=(long)nums[i]-i;
            if(!map.containsKey(fill)){
                map.put(fill,new ArrayList<>());
            }
            map.get(fill).add((long)i);
        }
        long count=0;
        for(long key:map.keySet()){
            long act=map.get(key).size();
            count+=(act*(act-1))/2;
        }
        long total=(n*(n-1))/2;
        
        return total-count;
    }
}