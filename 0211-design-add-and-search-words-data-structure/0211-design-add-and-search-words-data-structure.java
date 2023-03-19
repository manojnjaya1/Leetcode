class WordDictionary {
  Map<Integer,List<String>> m;
    
    public WordDictionary() {
        m=new HashMap<>();
        
    }
    
    public void addWord(String word) {
        int n=word.length();
        if(!m.containsKey(n)){
            List<String> ls=new ArrayList<>();
            m.put(n,ls);
        }
        m.get(n).add(word);
    }
    
    public boolean search(String word) {
        int n=word.length();
        if(!m.containsKey(n))return false;
        List<String> ls=m.get(n);
        if(isWord(word)){
            return ls.contains(word);
        }
        for(String st:ls){
            if(isSame(st,word))return true;
        }
        return false;
    }
    
    public boolean isWord(String word){
    int n = word.length();
    for(int i=0;i<n;i++){
        if(!Character.isLetter(word.charAt(i))){
            return false;
        }
    }
    return true;
}

public boolean isSame(String st,String word){
    if(st.length()!=word.length()){
        return false;
    }
    for(int i=0;i<st.length();i++){
        if(word.charAt(i) !='.' && word.charAt(i) != st.charAt(i)){
            return false;
        }
    }
    return true;
}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */