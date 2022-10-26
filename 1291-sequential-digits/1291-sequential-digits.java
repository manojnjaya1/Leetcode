class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       List<Integer> ans=new ArrayList<>();
        
        for(int sd=1;sd<=9;sd++){
            int inc=sd;
            int val=sd;
            
            while(inc<=9){
                if(val<=high && val>=low){
                    ans.add(val)              ;
                }
                
                    inc++;
                    val=val*10+inc;
                
            }
        }
         Collections.sort(ans);
        return ans; 
    }
}