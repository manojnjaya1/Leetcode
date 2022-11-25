class Solution {
    public String reverseParentheses(String s) {
        char[] arr=s.toCharArray();
        
        int n=s.length();
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i]=='('){
                st.push(i);
            }
            if(arr[i]==')'){
                int en=i;
                int end=en-1;
                
                int sta=st.pop();
                int star=sta+1;
                int k=0;
                for(int j=0;j<(en-sta)/2;j++){
                    char temp=arr[j+star];
                    arr[j+star]=arr[end-k];
                    arr[end-k]=temp;
                    k++;
                   
                }
               /* for(int l=0;l<n;l++){
                 System.out.print(arr[l]);
                }*/
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(arr[i]=='(' || arr[i]==')'){
                continue;
                
            }else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}