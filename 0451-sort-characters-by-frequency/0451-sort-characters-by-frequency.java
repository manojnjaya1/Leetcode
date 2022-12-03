class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        List<Character> []arr=new List[n+1];
        
        for(char c:map.keySet()){
            int fre=map.get(c);
            if(arr[fre]==null)arr[fre]=new ArrayList<>();
            
            arr[fre].add(c);
        }
        
    StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                for(char c:arr[i]){
                    for(int j=0;j<i;j++)
                        sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}