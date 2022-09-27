class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        Stack<Integer> s=new Stack<>();
        s.push(pushed[0]);
        int i=1;
        int j=0;
        int count=0;
        while(i<n ){
            if(!s.isEmpty() && s.peek()==popped[j]){
                s.pop();
                j++;
                count++;
            }
            else{
                s.push(pushed[i++]);
            }
        }
        while(!s.isEmpty()){
            if(s.peek()==popped[j]){
                s.pop();
                j++;
                count++;
            }
            else return false;
            
        }
        return  true;
    }
}