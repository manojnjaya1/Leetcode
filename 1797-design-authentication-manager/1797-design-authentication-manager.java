class AuthenticationManager {
    Map<String,Integer> map;
    int T;
    
    public AuthenticationManager(int timeToLive) {
        map=new HashMap<>();
        T=timeToLive;
       
    }
    
    public void generate(String tokenId, int currentTime) {
        map.put(tokenId,currentTime+T);
    }
    
    public void renew(String tokenId, int currentTime) {
        if(map.containsKey(tokenId)){
            if(map.get(tokenId)>currentTime)
                map.put(tokenId,currentTime+T);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count=0;
        for(String key:map.keySet()){
            if(map.get(key)>currentTime)count++;
        }
        return count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */