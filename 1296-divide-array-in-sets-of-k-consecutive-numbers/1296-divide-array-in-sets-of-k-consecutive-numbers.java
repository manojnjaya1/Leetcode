class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
      /*  PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int a:nums)pq.add(a);
        
        while(!pq.isEmpty()){
            int in=pq.poll();
            
            for(int i=1;i<k;i++){
                if(pq.remove(in+i))continue;
                else return false;
            }
        }
        
        return true;*/
         Map<Integer,Integer> map=new TreeMap<>();
        for(int a:nums)map.put(a,map.getOrDefault(a,0)+1);
        
        for(Integer it:map.keySet()){
            if(map.get(it)>0){
               for(int i=k-1;i>=0;--i) {
                   if(map.getOrDefault(it+i,0)<map.get(it))return false;
                   map.put(it+i,map.get(it+i)-map.get(it));
               }
            }
        }
        return true;
    }
}