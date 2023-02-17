class Solution {
    public int minJumps(int[] arr) {
       int n=arr.length;
        if(n==1)return 0;
        if( arr[0]==arr[n-1])return 1;
        Map<Integer,List<Integer>> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.computeIfAbsent(arr[i],v -> new ArrayList()).add(i);
        }
        
        Queue<Integer> que=new LinkedList<>();
        que.offer(0);
        int ans=0;
        
        while(!que.isEmpty()){
            ans++;
            int m=que.size();
            for(int i=0;i<m;i++){
                int j=que.poll();
                
                if(j-1>=0 && map.containsKey(arr[j-1])){
                    que.offer(j-1);
                    
                }
                if(j+1<n && map.containsKey(arr[j+1])){
                    if(j+1==n-1)return ans;
                    que.offer(j+1);
                }
                if( map.containsKey(arr[j])){
                    for(int k:map.get(arr[j])){
                        if(k!=j){
                            if(k==n-1)return ans;
                            que.offer(k);
                        }
                    }
                }
                
                map.remove(arr[j]);
                
            }
        }
        return ans;
    }
}