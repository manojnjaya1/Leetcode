class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
         TreeMap<Integer,Integer> w=new TreeMap<>();
        TreeMap<Integer,Integer> l=new TreeMap<>();
        int n=matches.length;
        
        ArrayList<List<Integer>> ans=new ArrayList<>();
        // ans.get(0).add(new ArrayList<Integer>());
        //  ans.get(1).add(new ArrayList<Integer>());
       List<Integer> win=new ArrayList<>();
          List<Integer> loose=new ArrayList<>();
        
        for(int[] a:matches){
            w.put(a[0],w.getOrDefault(a[0],0)+1);
             l.put(a[1],l.getOrDefault(a[1],0)+1);
        }
        
        for(int k:w.keySet()){
            if(!l.containsKey(k)){
               win.add(k);
            }
        }
        for(int k:l.keySet()){
            if(l.get(k)==1){
               loose.add(k);
            }
        }
        ans.add(win);
        ans.add(loose);
        return ans;
    }
}