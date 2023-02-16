class Solution {
    public String getHint(String s, String g) {
        int n=s.length();
        Set<Integer>set1=new HashSet<>();
               // Set<Integer>set2=new HashSet<>();
        Map<Character,Integer>m=new HashMap<>();

        int b=0;
        int i=0;
        int j=0;
        while(i<n&& j<n){
            if(s.charAt(i)==g.charAt(i)){
                set1.add(i);
                b++;
                }
            i++;
            j++;
        }
        i=0;
        while(i<n){
            if(!set1.contains(i)){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            }
            i++;
        }
        j=0;
        int c=0;
        while(j<n){
            if(!set1.contains(j) && m.containsKey(g.charAt(j))){
                m.put(g.charAt(j),m.getOrDefault(g.charAt(j),0)-1);
                if(m.get(g.charAt(j))==0)m.remove(g.charAt(j));
                c++;
            }
            j++;
        }
        String ans= b+"A"+c+"B";
        return ans;
    }
}