class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++ ){
               
                if(grid[i][j]==1){
                   
                    ans=Math.max(ans, count_island(grid,i,j));
                }
            }
        }
        return ans;
    }
    int count_island(int[][] grid,int i,int j){
      if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==1){
        grid[i][j]=0;
       return 1+ count_island(grid,i-1,j)+count_island(grid,i,j-1)+count_island(grid,i+1,j)+count_island(grid,i,j+1);
                              
        
        
      }
        return 0;
    }
}