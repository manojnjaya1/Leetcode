class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(n<=numRows)return s;
        if(numRows==1)return s;
        int k=0;
        int increment=1;
       String[] st=new String[numRows];
        for(int i=0;i<numRows;i++){
            st[i]="";
        }
        
        for(int i=0;i<n;i++){
            st[k]+=s.charAt(i);
            if(k==numRows-1)
                increment=-1;
           else  if(k==0)
                increment=1;
            k+=increment;
        }
        
        String res="";
        for(String str:st)
            res+=str;
        
        return res;
    }
}