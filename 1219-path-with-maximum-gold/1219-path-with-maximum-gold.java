class Solution {
    int r=0;
    int c=0;
    int ma=0;
    public int getMaximumGold(int[][] grid) {
        r=grid.length;
        c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]!=0){
                    dfs(grid,i,j,0);
                }
            }
        }
        return ma;
    }
    void dfs(int[][] grid,int i,int j,int cur){
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j]==0){
            ma=Math.max(ma,cur);
            return ;
        }
        int val=grid[i][j];
        grid[i][j]=0;
        dfs(grid,i-1,j,cur+val);
        dfs(grid,i,j-1,cur+val);
        dfs(grid,i+1,j,cur+val);
        dfs(grid,i,j+1,cur+val);
        grid[i][j]=val;
    }
}