class Solution {
    public boolean isPossible(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>freq=new HashMap<>(),adjfreq=new HashMap<>();
        for(int i:nums)freq.put(i,freq.getOrDefault(i,0)+1);
        for(int i:nums){
            if(freq.get(i)==0)continue;
            else if(adjfreq.getOrDefault(i,0)>0){
                adjfreq.put(i,adjfreq.getOrDefault(i,0)-1);
                 adjfreq.put(i+1,adjfreq.getOrDefault(i+1,0)+1);
            }
            else if(freq.getOrDefault(i+1,0)>0 && freq.getOrDefault(i+2,0)>0){
                freq.put(i+1,freq.getOrDefault(i+1,0)-1);
                freq.put(i+2,freq.getOrDefault(i+2,0)-1);
                  adjfreq.put(i+3,adjfreq.getOrDefault(i+3,0)+1);
                
            }
            else return false;
            freq.put(i,freq.getOrDefault(i,0)-1);
        }
        return true;
    }
}