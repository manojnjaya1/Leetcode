class Solution {
    public int minDistance(String word1, String word2) {
      /*  int n=word1.length();
        int m=word2.length();
        int[] prev=new int[m+1];
        int[] cur=new int[m+1];
        
        for(int i=0;i<=m;i++)prev[i]=i;
        
        for(int i=1;i<=n;i++){
           // cur[0]=i;
            Arrays.fill(cur,0);
            cur[0]=i;
             for(int j=1;j<=m;j++){
                 if(word1.charAt(i-1)==word2.charAt(j-1))
                     cur[j]=prev[j-1];
                else 
                    cur[j]=1+Math.min(prev[j],Math.min(cur[j-1],prev[j-1]));
            }
            prev=cur;
        }
        return prev[m];*/
        
        int n=word1.length();
        int m=word2.length();
        int[][] prev= new int[n+1][m+1];
        
        
        for(int j=0;j<=m;j++)prev[0][j]=j;
       for(int j=0;j<=n;j++)prev[j][0]=j;
        for(int i=1;i<=n;i++){
          
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    prev[i][j]=prev[i-1][j-1];
                else prev[i][j]=1+Math.min(prev[i-1][j],Math.min(prev[i][j-1],prev[i-1][j-1]));
               // System.out.println(cur[j]+" "+j+" "+i);
            }
         
        }
       
        return prev[n][m];
    }
}