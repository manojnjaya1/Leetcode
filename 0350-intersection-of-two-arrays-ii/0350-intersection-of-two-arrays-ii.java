class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
      int m=nums2.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> lis=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        
         for(int i=0;i<m;i++){
             if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                 lis.add(nums2[i]);
                  map.put(nums2[i],map.get(nums2[i])-1);
             }
         }
             int a=lis.size();
             int[] res=new int[a];
           for(int i=0;i<a;i++){
               res[i]=lis.get(i);
           }
        
        return res;
    }
}