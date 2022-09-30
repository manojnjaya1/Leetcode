class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int val:arr){
            int r=val%k;
             if(r< 0) r += k;
            map.put(r,map.getOrDefault(r,0)+1);
        }
        for(int val:arr){
            int rem=val%k;
            if(rem<0)rem+=k;
            if(rem==0){
                int a=map.get(rem);
                if(a%2!=0){
                    return false;
                }
            }else if(2*rem==k){
                int a=map.get(rem);
                 if(a%2!=0){
                    return false;
                }
            }else{
                int rf=map.get(rem);
                int orf=map.getOrDefault(k-rem,0);
                if(rf!=orf){
                    return false;
                }
            }
        }
        return true;
    }
}