class BrowserHistory {
    TreeMap<Integer,String> map;
    int present=0;
    int key=0;
    public BrowserHistory(String homepage) {
        map=new TreeMap<>();
        key++;
        map.put(key,homepage);
    }
    
    public void visit(String url) {
        int cur=map.lastKey();
        if(key<cur){
            
        
        int n=key+1;
        for(int i=n;i<=cur;i++){
            map.remove(i);
        }
         }
        key++;
        // System.out.println(key);
        map.put(key,url);
    
    }
    
    public String back(int steps) {
    
        if(steps>=key){
            key=1;
        }
        else{
            key=key-steps;
        }
                // System.out.println(key);

        
        return map.get(key);
    }
    
    public String forward(int steps) {
        int cur=map.lastKey();
        if(cur-key<=steps){
       key=cur;
       
        } 
        else{
            key+=steps;
            
        }
                    // System.out.println(key);

        return map.get(key);
    }
}


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */