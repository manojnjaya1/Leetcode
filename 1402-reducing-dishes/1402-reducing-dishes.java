class Solution {
    public int maxSatisfaction(int[] s) {
        int n=s.length;
        Arrays.sort(s);
        
      int maxSat=0;
        int suff=0;
        
        for(int i=n-1;i>=0 && suff+s[i]>0;i--){
            suff+=s[i];
            maxSat+=suff;
        }
       
        return maxSat;
        
    }
}