class Solution {
     public void insertAndRemove(Map<Character, Integer> mp, char toInsert, char toRemove){  // made this helper fxn for easy removal from hashmap
        mp.put(toInsert, mp.getOrDefault(toInsert, 0) + 1); 
        mp.put(toRemove, mp.getOrDefault(toRemove, 0) - 1);  
        if(mp.get(toRemove)==0) mp.remove(toRemove);
    }
    
    public boolean isItPossible(String word1, String word2) {
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        
        for (char w1: word1.toCharArray()) {  
            mp1.put(w1, mp1.getOrDefault(w1, 0) + 1);
        }
        for (char w2: word2.toCharArray()) {  
            mp2.put(w2, mp2.getOrDefault(w2, 0) + 1);
        }

        
        for(char c1='a'; c1<='z'; c1++){
            for(char c2='a'; c2<='z'; c2++){

                if(!mp1.containsKey(c1) || !mp2.containsKey(c2)) continue; 
                insertAndRemove(mp1, c2, c1); 
                insertAndRemove(mp2, c1, c2); 
                if(mp1.size()==mp2.size()) return true; 
                insertAndRemove(mp1, c1, c2); 
                insertAndRemove(mp2, c2, c1); 
            }
        }
        
        return false;
        
    }
}