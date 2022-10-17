

class Solution {
    public String removeDuplicates(String s) {
      int n=s.length();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}