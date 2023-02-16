class Solution {
    public List<String> letterCombinations(String d) {
        List<String> li=new LinkedList<>();
        int n =d.length();
         if(n==0)return li;
        li.add("");
       String[] digArr=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       
        
        for(int i=0;i<n;i++){
            li=combine(digArr[d.charAt(i)-'0'],li);
        }
        return li;
    }
    List<String> combine(String dig,List<String> arr){
                List<String> li=new LinkedList<>();
             
        for(int i=0;i<dig.length();i++){
            for(String s:arr){
                li.add(s+dig.charAt(i));
            }
        
        }
        return li;
    }
}