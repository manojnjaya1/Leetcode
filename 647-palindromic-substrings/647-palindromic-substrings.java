class Solution {
    public int countSubstrings(String s) {
         int n=s.length();
       // int start=0;
       // int max_len=1;
       // if(n==0)return "";
        int count =n;
        for(int i=0;i<n;i++){
            for(int l=i-1 ,r=i;l>=0 && r<n && s.charAt(l)==s.charAt(r);--l,++r){
                count++;
              /*  if(r-l+1>max_len){
                    max_len=r-l+1;
                    start=l;
                }*/
            }
             for(int l=i-1 ,r=i+1;l>=0 && r<n && s.charAt(l)==s.charAt(r);--l,++r){
                 count++;
             /*   if(r-l+1>max_len){
                    max_len=r-l+1;
                    start=l;
                }*/
            }
        }
        System.out.println(count);
        return count;
        }
}