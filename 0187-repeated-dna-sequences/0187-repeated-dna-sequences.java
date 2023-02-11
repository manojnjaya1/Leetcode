class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set=new HashSet<>();
                HashSet<String> set2=new HashSet<>();

        List<String> ans=new ArrayList<>();
        
        int i=0;
        int j=9;
        int n=s.length();
        if(n<=10)return ans;
        
        while(j<n){
            String s1=s.substring(i,j+1);
            if(set.contains(s1)){
                set2.add(s1);
                
            }else{
                set.add(s1);
            }
            i++;
            j++;
        }
        
        for(String str:set2){
            ans.add(str);
        }
        return ans;
    }
}