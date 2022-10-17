class Solution {
    public String removeOccurrences(String s, String part) {
       
   
     char[] res=s.toCharArray()       ;
	int n = s.length(), m = part.length();
	
        int i=0;
        
        for(int j=0;j<n;j++,i++){
            res[i]=res[j];
         
            if(i>=m-1 &&  new String(res,i-m+1,m).equals(part))i-=m;
        }
        return new String(res,0,i);
   
}
    }
