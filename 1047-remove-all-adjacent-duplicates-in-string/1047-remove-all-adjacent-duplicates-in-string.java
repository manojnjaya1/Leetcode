

class Solution {
    public String removeDuplicates(String s) {
      int n=s.length();
//         Stack<Character> st=new Stack<>();
//         StringBuilder sb=new StringBuilder();
        
//         for(int i=0;i<n;i++){
//             if(!st.isEmpty() && st.peek()==s.charAt(i)){
//                 st.pop();
//             }else{
//                 st.add(s.charAt(i));
//             }
//         }
//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }
//         return sb.reverse().toString();
        int i=0;
        char[] res=s.toCharArray();
        for(int j=0;j<n;j++,i++){
            res[i]=res[j];
            if(i>0 && res[i]==res[i-1])i-=2;
        }
        return new String(res,0,i);
    }
}