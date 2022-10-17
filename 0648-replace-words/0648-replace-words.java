class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        if (dict == null || dict.size() == 0) return sentence;
        
        Set<String> set = new HashSet<>();
        for (String s : dict) set.add(s);
        
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            StringBuilder nb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
               nb.append(word.charAt(i)) ;
                if (set.contains(nb.toString())) break;
            }
            sb.append(" " + nb.toString());
        }
        
        return sb.deleteCharAt(0).toString();
    }
}