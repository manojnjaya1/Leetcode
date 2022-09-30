class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int maxi=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(List<Integer> list:wall){
            int ps=0;
            for(int i=0;i<list.size()-1;i++){
                int val=list.get(i);
                ps+=val;
                map.put(ps,map.getOrDefault(ps,0)+1);
                maxi=Math.max(map.get(ps),maxi);
            }
        }
        return wall.size()-maxi;
    }
}