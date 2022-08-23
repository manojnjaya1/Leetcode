class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                    check(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void check(char[][] grid ,boolean[][] visited,int i,int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || visited[i][j]==true || grid[i][j]=='0'){
            return;
        }
        visited[i][j]=true;
        check(grid,visited,i-1,j);
        check(grid,visited,i,j+1);
        check(grid,visited,i+1,j);
        check(grid,visited,i,j-1);
    }
}