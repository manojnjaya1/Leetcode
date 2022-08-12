class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,(map.getOrDefault(n,0)+1));
        }
                    PriorityQueue<int[]> q=new PriorityQueue<int[]>((a,b)->a[1] - b[1]);
                    
                    for(int key:map.keySet()){
                        q.add(new int[]{key,map.get(key)});
                        if(q.size()>k)q.poll();
                    
                    }
                    
                    int[] arr=new int[k];
                    int i=0;
                    while(!q.isEmpty()){
                        arr[i++]=q.poll()[0];
                    }
                    return arr;
    }
}