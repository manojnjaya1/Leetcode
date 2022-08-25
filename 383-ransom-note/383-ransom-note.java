class Solution {
    public boolean canConstruct(String s, String p) {
        Map<Character,Integer> map=new HashMap<>();
         for(int i=0;i<s.length();i++){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
        for(int i=0;i<p.length();i++){
              map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)-1) ;         
         }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) 
        {   if( entry.getValue()<=0)continue;
        else return false;
    }
    return true;
    }
}