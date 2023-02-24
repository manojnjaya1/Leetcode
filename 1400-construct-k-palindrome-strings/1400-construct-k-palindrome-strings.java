class Solution {
    public boolean canConstruct(String s, int k) {
       int n=s.length() ;
        if(k>n)return false;
        if(k==n)return true;
        
        Map<Character,Integer> map=new HashMap<>();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int oddCount=0;
        for(char key:map.keySet()){
            if(map.get(key)%2!=0)oddCount++;
        }
        if(oddCount>k)return false;
        return true;
    }
}