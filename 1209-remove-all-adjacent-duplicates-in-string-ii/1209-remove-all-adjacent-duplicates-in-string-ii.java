class Solution {
    public String removeDuplicates(String s, int k) {
       int n=s.length();
        int i=0;
        char[] res=s.toCharArray();
        for(int j=0;j<n;j++,i++){
            res[i]=res[j];
            if(i>k-2){
                int b=1;
              while(b<k)  {
                 if(res[i]==res[i-b]){
                     b++;
                     
                 }else{
                     break;
                 }
                  
              }
                if(b==k)i-=k;
                
            }  
            
        }
        return new String(res,0,i);
    }
}