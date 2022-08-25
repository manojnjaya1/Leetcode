class Solution {
    public int compress(char[] chars) {
       
        int idx=0;
        
        for(int i=0;i<chars.length;)
        {
            int j=i+1;
            while(j<chars.length && chars[i]==chars[j])j++;
            String s=String.valueOf(j-i);
            chars[idx++]=chars[i];
            if(j-i !=1)
            for(char c:s.toCharArray())chars[idx++]=c;
            i=j;
        }
        return idx;
    }
}