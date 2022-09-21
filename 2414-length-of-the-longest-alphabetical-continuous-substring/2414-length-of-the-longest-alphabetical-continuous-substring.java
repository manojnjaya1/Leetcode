class Solution {
    public int longestContinuousSubstring(String s) {
      int n=s.length()  ;
       
        int maxl=1;
        
        int i=0;
        while(i<n-1){
             int l=1;
            int k=i;
            int j=i+1;
            while( k< n-1 && j<n && s.charAt(j)==s.charAt(k)+1){
                l++;
                j++;
                k++;
                if(l>maxl)maxl=l;
            }
            i++;
        }
        return maxl;
    }
}