class Solution {
    public String reorganizeString(String s) {
       int n=s.length() ;
      int[] hash=new int[26];
        for(int i=0;i<n;i++){
           hash[s.charAt(i)-'a']++;
        }
       int maxi=0;
        int letter=0;
        for(int i=0;i<26;i++){
         if(hash[i]>maxi){
             maxi=hash[i];
             letter=i;
         }
        }
          System.out.println(maxi)                 ;
       if(maxi>(n+1)/2){
           return "";
       }
          char[] res=new char[n];
          int idx=0;
        while(hash[letter]>0){
            res[idx]=(char)(letter+'a');
            idx+=2;
            hash[letter]--;
        }
          for(int i=0;i<26;i++){
              while(hash[i]>0){
                  if(idx>=n){
                      idx=1;
                  }
                  res[idx]=(char)(i+'a');
            idx+=2;
            hash[i]--;
              }
          }
          
        return String.valueOf(res)   ;
  }
}