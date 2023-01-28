class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
       // List<String> lis=new ArrayList<>();
        int n=s.length();
        String ans=new String();
        for(String str:dictionary){
            int m=str.length();
            int i=0;
            int j=0;
            while(i<n && j<m){
                if(s.charAt(i)==str.charAt(j)){
                    i++;
                    j++;
                }
                else i++;
            }
            if(j==m && str.length()>=ans.length()){
                if(str.length()==ans.length() && ans.compareTo(str)>=0){
                
                        ans=str;
                    
                }
                if(str.length()>ans.length())ans=str;
                
                
            }
            
        }
        return ans;
    }
}