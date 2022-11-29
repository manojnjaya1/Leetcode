class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
      int n=arr.length;
       List<Integer> ls=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i:arr ){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i:map.keySet()){
            ls.add(map.get(i));
        }
        Collections.sort(ls);
        int i=0;
        while(k>0 && i<ls.size() ){
            if(k>=ls.get(i)){
             k-=ls.get(i);  
                i++;
            }else break;
            
        }
        return ls.size()-i;
    }
}