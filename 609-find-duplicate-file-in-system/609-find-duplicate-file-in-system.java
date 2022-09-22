class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        
        int n=paths.length;
        
        for(int i=0;i<n;i++){
            String s=paths[i];
            String[] str=s.split(" ");
            String dir=str[0]+"/";
            
            for(int j=1;j<str.length;j++){
                String a=str[j];
               
                int t=0;
                while(t<a.length() && a.charAt(t)!='(')t++;
                 String name=a.substring(0,t);
                String content=a.substring(t+1,a.length()-1);
                
                map.computeIfAbsent(content,b->new ArrayList<>());
                map.get(content).add(dir+name);
                
            }
        }
        for(String key:map.keySet()){
            if(map.get(key).size()>1){
                res.add(map.get(key));
            }
        }
        return res;
    }
}