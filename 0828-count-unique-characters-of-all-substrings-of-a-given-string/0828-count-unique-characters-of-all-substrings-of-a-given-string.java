class Solution {
    public int uniqueLetterString(String s) {
        HashMap<Character,List<Integer>> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           map.computeIfAbsent(c,key->new ArrayList<>()).add(i);
        }
        
        for(List<Integer> ind:map.values()){
            for(int i=0;i<ind.size();i++){
                int left=i==0?ind.get(i)+1:ind.get(i)-ind.get(i-1);
                int right=i==ind.size()-1?s.length()-ind.get(i):ind.get(i+1)-ind.get(i);
                
                sum+=left*right;
            }
        }
        return sum;
    }
}