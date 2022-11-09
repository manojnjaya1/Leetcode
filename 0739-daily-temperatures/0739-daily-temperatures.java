class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s=new Stack<>();
        
        int n=t.length;
        int[] ans=new int[n];
         int res = 1;
        for(int i=n-1;i>=0;i--){
            
            while(!s.isEmpty() && t[s.peek()]<=t[i])s.pop();
                
     if(!s.isEmpty())
         ans[i]=s.peek()-i;
           
        s.push(i);
            
        }
        return ans;
                
        }
    }
