class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n)return false;
       Map<Character,Integer> map=new TreeMap<>(),map2=new TreeMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        
        for(int i=0;i<s1.length() ;i++){
              map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        if(map.equals(map2))return true;
        
        for(int i=s1.length();i<s2.length();i++){
              map2.put(s2.charAt(i-n),map2.get(s2.charAt(i-n))-1);
            if(map2.get(s2.charAt(i-n))==0)map2.remove(s2.charAt(i-n));
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
             if(map.equals(map2))return true;
        }
        
        return false;
    }
}