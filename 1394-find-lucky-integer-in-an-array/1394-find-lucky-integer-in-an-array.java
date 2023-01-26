class Solution {
    public int findLucky(int[] arr) {
       Map<Integer,Integer> map=new TreeMap<>() ;
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int ans=-1;
        for(int k:map.keySet()){
            if(k==map.get(k)){
                ans=k;
            }
        }
        return ans;
    }
}