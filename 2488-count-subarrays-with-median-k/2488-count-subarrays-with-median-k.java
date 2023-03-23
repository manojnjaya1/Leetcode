class Solution {
    public int countSubarrays(int[] nums, int k) {
        int index = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                index = i;
                break;
            }
        }
        int sum = 0;
        for(int i=index;i<nums.length;i++){
            int value = nums[i]==k?0:(nums[i]>k)?1:-1;
            sum += value;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        sum=0;
        for(int i=index;i>=0;i--){
            int value = nums[i]==k?0:(nums[i]>k)?1:-1;
            sum += value;
            count += map.getOrDefault(0-sum,0);
            count += map.getOrDefault(1-sum,0);
        }
        return count ;
        
    }
}