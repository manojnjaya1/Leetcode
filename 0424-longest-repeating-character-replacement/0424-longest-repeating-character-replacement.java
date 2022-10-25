class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] a=new int[26];
        int maxf=0;
        int res=0;
        int l=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            a[c-'A']++;
            maxf=Math.max(maxf,a[c-'A']);
            
         
            while(r-l+1-maxf>k){
                a[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,r-l+1);
            
            
        }
        return res;
    }
}