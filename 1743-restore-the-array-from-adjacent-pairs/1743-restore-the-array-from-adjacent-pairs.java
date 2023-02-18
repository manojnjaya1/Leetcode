class Solution {
    public int[] restoreArray(int[][] arr) {
     int n=arr.length;
        int[] ans=new int[n+1];
        int count=1;
        Map<Integer,List<Integer>> map=new HashMap<>();
        
        for(int[] a:arr){
            map.putIfAbsent(a[0],new ArrayList<>());
            map.putIfAbsent(a[1],new ArrayList<>());
             
            map.get(a[0]).add(a[1]);
            map.get(a[1]).add(a[0]);

        }
        int start=0;
        for(int key:map.keySet()){
            if(map.get(key).size()==1){
                start=key;
                break;
            }
        }
        ans[0]=start;
        int prev=start;
        //System.out.println(start);
        while(count<n+1){
            
        List<Integer> li=map.get(start);
                   // System.out.println(li.get(0));

            if(li.get(0)!=prev)ans[count]=li.get(0);
            else ans[count]=li.get(1);
count++;
//             System.out.println(ans[count]);
            prev=start;            
            start=ans[count-1];
        }
            //while(count < arr.length + 1) {
           
//            List<Integer> ansSet = map.get(start);
           
//            if(ansSet.get(0) != prev) ans[count++] = ansSet.get(0);
//            else ans[count++] = ansSet.get(1);
          
//            prev = start;
//            start = ans[count-1];
//        }
       
        
        return ans;
    }
}