class Solution {
    public String reverseWords(String s) {
       int n=s.length();
        StringBuilder sb=new StringBuilder();
        
        String[] str=s.split(" ");
        int m=str.length;
        for(int i=0;i<m;i++){
            String os=str[i];
            String ns=swap(os);
            ns+=" ";
            sb.append(ns);
        }
        String ans=sb.toString();
        return ans.substring(0,ans.length()-1);
    }
     String swap(String s){
         int n=s.length();
          StringBuilder sb=new StringBuilder(s);
         int i=0;
         int j=n-1;
         while(i<j){
             sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j, s.charAt(i));
             i++;
             j--;
         }
        return sb.toString();
         
     }
}