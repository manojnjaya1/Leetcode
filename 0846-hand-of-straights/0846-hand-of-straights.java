class Solution {
    public boolean isNStraightHand(int[] hand, int s) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int a:hand)map.put(a,map.getOrDefault(a,0)+1);
        
        for(Integer it:map.keySet()){
            if(map.get(it)>0){
               for(int i=s-1;i>=0;--i) {
                   if(map.getOrDefault(it+i,0)<map.get(it))return false;
                   map.put(it+i,map.get(it+i)-map.get(it));
               }
            }
        }
        return true;
    }
}