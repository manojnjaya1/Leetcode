class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
//         int n1=nums1.length;
//         int n2=nums2.length;
        
//         Map<Long,Integer> map1=new HashMap<>();
//           Map<Long,Integer> map2=new HashMap<>();
        
//         for(int i=0;i<n1-1;i++){
            
//                 long num= (long)(nums1[i]*nums1[i]);
//                 map1.put(num,map1.getOrDefault(num,0)+1);
            
//         }
//          for(int i=0;i<n2-1;i++){
           
//                 long num= (long)(nums2[i]*nums2[i]);
//                 map2.put(num,map2.getOrDefault(num,0)+1);
            
//         }
       //  System.out.println(map1.toString());
       //          System.out.println(map2.toString());
       // long a=(long)(43024*99908);
       //          System.out.println(a);


        // int ans=0;
        // for(int i=0;i<n1-1;i++){
        //     for(int j=i+1;i<n1;i++){
        //         ans+=map2.getOrDefault((long)(nums1[i]*nums1[j]),0);
        //     }
        // }
        //  for(int i=0;i<n2-1;i++){
        //     for(int j=i+1;i<n2;i++){
        //         ans+=map1.getOrDefault((long)(nums2[i]*nums2[j]),0);
        //     }
        // }
        // for(int i=0;i<n1;i++){
        //     long num=nums1[i]*nums1[i];
        //     ans+=map2.getOrDefault(num,0);
        // }
        //  for(int i=0;i<n2;i++){
        //     long num=nums2[i]*nums2[i];
        //     ans+=map1.getOrDefault(num,0);
        // }
        // return ans;
          return preProcessProblem(nums1, nums2) + preProcessProblem(nums2, nums1);
    }
    public int preProcessProblem(int [] nums1, int [] nums2) {
        int result = 0;
        int n1 = nums1.length; 
        int n2 = nums2.length;
        Map<Long, Integer> map = new HashMap<>();
        for (int i=0; i<n1; i++) {
            map.put((long)nums1[i]*nums1[i], map.getOrDefault((long)nums1[i]*nums1[i], 0) + 1);
        }
        for (int j=0; j<n2-1; j++) {
            for (int k=j+1; k<n2; k++) {
                result += (long)map.getOrDefault((long)nums2[j]*nums2[k], 0);
            }
        }
        return result;
    }
}