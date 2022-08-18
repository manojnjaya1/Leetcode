class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        int max_len=1;
        if(n==0)return "";
        
        for(int i=0;i<n;i++){
            for(int l=i-1 ,r=i;l>=0 && r<n && s.charAt(l)==s.charAt(r);--l,++r){
                if(r-l+1>max_len){
                    max_len=r-l+1;
                    start=l;
                }
            }
             for(int l=i-1 ,r=i+1;l>=0 && r<n && s.charAt(l)==s.charAt(r);--l,++r){
                if(r-l+1>max_len){
                    max_len=r-l+1;
                    start=l;
                }
            }
        }
        System.out.println(max_len);
        return max_len==0?"":s.substring(start,start+max_len);
        
    }
}