class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            int first=s.indexOf(s.charAt(i),0);
            int last=s.lastIndexOf(s.charAt(i));
            if(first==last)return i;
            
        }
        return -1;
    }
}