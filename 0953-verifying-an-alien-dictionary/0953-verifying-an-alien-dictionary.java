class Solution {
    int[] map=new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<order.length();i++){
            map[order.charAt(i)-'a']=i;
        }
        for(int i=1;i<words.length;i++){
            if(bigger(words[i-1],words[i]))
                return false;
        }
        return true;
        
    }
    boolean bigger(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        for(int j=0;j<n && j<m;j++){
            if(s1.charAt(j)!=s2.charAt(j))
                return map[s1.charAt(j)-'a']>map[s2.charAt(j)-'a'];
        }
        return n>m;
    }
}