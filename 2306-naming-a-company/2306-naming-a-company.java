class Solution {
    public long distinctNames(String[] ideas) {
     /*  int n= ideas.length;
        Map<String,Integer> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        
        for(String s:ideas){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                StringBuilder s1=new StringBuilder(ideas[i]);
              StringBuilder s2=new StringBuilder(ideas[j]);
              //  s1=s1.deleteCharAt(0);
              //  s2=s2.deleteCharAt(0);
                s1=s1.replace(0,1,""+ideas[j].charAt(0));
                s2=s2.replace(0,1,""+ideas[i].charAt(0));
                String ns1=s1.toString();
                String ns2=s2.toString();
                
               // System.out.println(ns1 +" "+ ns2);
                
                if(!map.containsKey(ns1) && !map.containsKey(ns2)){
                    set.add(s1+" "+s2);
                }
               
            }
        }
        return set.size();*/
         long ans = 0;
    // Group strings by initials
    Set<String>[] suffixes = new Set[26];

    for (int i = 0; i < 26; ++i)
      suffixes[i] = new HashSet<>();

    for (final String idea : ideas)
      suffixes[idea.charAt(0) - 'a'].add(idea.substring(1));

    for (int i = 0; i < 25; ++i)
      for (int j = i + 1; j < 26; ++j) {
        int count = 0;
        for (final String suffix : suffixes[i])
          if (suffixes[j].contains(suffix))
            ++count;
        ans += 2 * (suffixes[i].size() - count) * (suffixes[j].size() - count);
      }

    return ans;
    }
}