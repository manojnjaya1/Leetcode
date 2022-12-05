class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
      HashMap<Long,Long> map=new HashMap<>()  ;
        
        long ans=0;
        for(long task:tasks){
            if(map.containsKey(task)){
                ans=Math.max(ans,map.get(task));
            }
            map.put(task,ans+space+1);
            ans++;
        }
        return ans;
    }
}