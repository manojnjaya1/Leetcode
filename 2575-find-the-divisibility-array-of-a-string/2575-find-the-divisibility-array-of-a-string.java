
// Java program to find large factorials using BigInteger
import java.math.BigInteger;

class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n=word.length();
        int[] div=new int[n];
        long prevRem=0;
        for(int i=0;i<n;i++){
            
          int a=word.charAt(i)-'0' ;
          long newD=prevRem*10+(long)a;
             
            long rem=newD%(long)m;
            if(rem==0)div[i]=1;
            else div[i]=0;
             
            prevRem=rem;
        }
        return div;
    }
}