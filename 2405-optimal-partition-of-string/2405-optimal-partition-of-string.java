class Solution {
    public int partitionString(String s) {
        int n=s.length();
        
        Set<Character> set=new HashSet<>();
        
        int count=0;
        int i=0;
        
        while(i<n){
            char c=s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                i++;
            }
            else{
                count++;
                set.clear();
                set.add(c);
                i++;
            }
        }
        return count+1;
    }
}