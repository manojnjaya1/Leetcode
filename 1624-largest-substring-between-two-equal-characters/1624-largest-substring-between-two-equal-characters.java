class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len=-1;
        
        for(int i=0;i<s.length();i++){
            int lastIndex=s.lastIndexOf(s.charAt(i));
            
            if(lastIndex!=i){
                len=Math.max(len,lastIndex-(i+1));
            }
        }
        return len;
        
        
    }
}