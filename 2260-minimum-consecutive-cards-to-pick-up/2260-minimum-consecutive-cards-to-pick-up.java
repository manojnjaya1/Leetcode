class Solution {
    public int minimumCardPickup(int[] cards) {
        int n=cards.length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
            if(map.containsKey(cards[i])){
                int size=map.get(cards[i]).size()-1;
                map.get(cards[i]).add(i);
                int cur=i-map.get(cards[i]).get(size) +1;
                ans=Math.min(ans,cur);
            }else{
                map.put(cards[i],new ArrayList<>());
                map.get(cards[i]).add(i);
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}