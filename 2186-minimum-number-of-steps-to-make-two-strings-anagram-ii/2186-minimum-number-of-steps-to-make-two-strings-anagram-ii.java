class Solution {
    public int minSteps(String s, String t) {
    /*  Map<Character,Integer> m1=new HashMap<>();
      Map<Character,Integer> m2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
        }
          for(int i=0;i<t.length();i++){
            m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);
        }
        int ans=0;
        for(char c:m1.keySet()){
            
            ans+=Math.abs(m1.getOrDefault(c,0)-m2.getOrDefault(c,0));
           // if(m1.containsKey(c))m1.remove(c);
                        if(m2.containsKey(c))m2.remove(c);

        }
        
        for(char c:m2.keySet()){
            ans+=m2.get(c);
        }
        return ans;*/
        int ans = 0;
    int[] sCounter = new int[26], tCounter = new int[26];
    for(char ch: s.toCharArray()) sCounter[ch - 'a']++;
    for(char ch: t.toCharArray()) tCounter[ch - 'a']++;
    for (int i = 0; i < 26; i++) ans += Math.abs(sCounter[i] - tCounter[i]);
    return ans;
    }
}