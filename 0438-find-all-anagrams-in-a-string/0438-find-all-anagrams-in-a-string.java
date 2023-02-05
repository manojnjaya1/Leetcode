class Solution {
    public List<Integer> findAnagrams(String s1, String s2) {
         int n=s1.length();
        int m=s2.length();
        
       //Map<Character,Integer> map=new TreeMap<>(),map2=new TreeMap<>();
        int[] arr=new int[26];
        int[] arr2=new int[26];
               List<Integer> ans=new ArrayList<>();

        if(n<m)return ans;
        for(int i=0;i<s2.length();i++){
          //  map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            arr[s2.charAt(i)-'a']++;
        }
        
        for(int i=0;i<s2.length() ;i++){
              //map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
             arr2[s1.charAt(i)-'a']++;
        }
               // System.out.println(Arrays.toString(arr));

        //if(map.equals(map2))return true;
        if(Arrays.equals(arr,arr2))ans.add(0);
      //  System.out.println(Arrays.toString(arr2));
        
        for(int i=s2.length();i<s1.length();i++){
            //  map2.put(s2.charAt(i-n),map2.get(s2.charAt(i-n))-1);
            arr2[s1.charAt(i-m)-'a']--;
            //if(map2.get(s2.charAt(i-n))==0)map2.remove(s2.charAt(i-n));
           // map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            arr2[s1.charAt(i)-'a']++;
                  //  System.out.println(Arrays.toString(arr2));

             if(Arrays.equals(arr,arr2))ans.add(i-m+1);
        }
        
        return ans;
    }
}