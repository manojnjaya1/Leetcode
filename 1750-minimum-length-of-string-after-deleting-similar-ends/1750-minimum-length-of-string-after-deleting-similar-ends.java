class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        
        int i=0;
        int j=n-1;
        while(i<j && sb.charAt(i)==sb.charAt(j)){
            int c=j;
            while(i<j && sb.charAt(i+1)==sb.charAt(i))i++;
            while(j>i && sb.charAt(j-1)==sb.charAt(j) )j--;
            
            sb.delete(j,sb.length());
            sb.delete(0,i+1);
            // System.out.println(sb.toString());
            i=0;
            j=sb.length()-1;
        }
        return sb.length();
    }
}