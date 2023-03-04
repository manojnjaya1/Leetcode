class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int n=words1.length;
        int m=words2.length;
        
        int[] bmax=count("");
        for(String b:words2){
            int[] bcount=count(b);
            for(int i=0;i<26;i++){
                bmax[i]=Math.max(bcount[i],bmax[i]);
            }
 
        }
        List<String> ans=new ArrayList<>();
        outer:for(String a:words1) {
            int[] acount=count(a);
            for(int i=0;i<26;i++){
                if(acount[i]<bmax[i]){
                    continue outer;
                }
            }
            ans.add(a);
        }
        return ans;
    }
    int[] count(String s)
    {
        int[] ans=new int[26];
        for(char c:s.toCharArray()){
            ans[c-'a']++;
        }
        return ans;
    }
}