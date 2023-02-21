class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> st=new HashSet<>();
        int i=0;int j=0;
         List<Integer> ans=new ArrayList<>();
        if(bound==0 || bound==1)return ans;
        if(x==1 && y==1){
            ans.add(2);
            return ans;
            
        }
        else if(x==1){
            j=0;
             while(Math.pow(x,i)+Math.pow(y,j)<=bound){
                
                    st.add((int)(Math.pow(x,i)+Math.pow(y,j)));
                    j++;
                
            }
        }
        else if(y==1){
            j=0;
             while(Math.pow(x,i)+Math.pow(y,j)<=bound){
                
                    st.add((int)(Math.pow(x,i)+Math.pow(y,j)));
                    i++;
                
            }
        }
        else {
            while(Math.pow(x,i)+Math.pow(y,j)<=bound){
            j=0;
            while(Math.pow(x,i)+Math.pow(y,j)<=bound){
                
                    st.add((int)(Math.pow(x,i)+Math.pow(y,j)));
                    j++;
                
            }
            j=0;
            i++;
        }
        }
       
        for(int k:st){
            ans.add(k);
        }
        return ans;
    }
}