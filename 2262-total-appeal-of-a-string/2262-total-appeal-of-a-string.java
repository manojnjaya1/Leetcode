class Solution {
    public long appealSum(String s) {
        int n=s.length();
      long cur=0;
        long rslt=0;
        int[] arr=new int[26];
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(arr[c-'a']==0){
                cur+=i+1;
            }
            else{
                cur+=(i+1)-arr[c-'a'];
            }
            arr[c-'a']=i+1;
            
            rslt+=cur;
            
        }
        return rslt;
    }
}