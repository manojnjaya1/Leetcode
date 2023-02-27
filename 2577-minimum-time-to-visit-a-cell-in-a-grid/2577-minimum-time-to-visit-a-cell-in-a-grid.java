class Solution {
    public int minimumTime(int[][] grid) {
       int n=grid.length;
        int m=grid[0].length;
        int[][] dirs=new int[][]{{0,1},{-1,0},{0,-1},{1,0}};
    boolean[][] visited=new boolean[n][m];
        if(grid[0][1]>1 && grid[1][0]>1)return -1;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        
        pq.offer(new int[]{grid[0][0],0,0});
            
            while(!pq.isEmpty()){
                int[] cur=pq.poll();
                
                int time=cur[0],row=cur[1],col=cur[2];
                if(row==n-1 && col==m-1)return time;
                if(visited[row][col])continue;
                visited[row][col]=true;
                
                for(int[] dir:dirs){
                    int r=row+dir[0],c=col+dir[1];
                    if(r<0 || r>=n || c<0 ||c>=m || visited[r][c])continue;
                    int wait=((grid[r][c]-time)%2==0)?1:0;
                    pq.offer(new int[]{Math.max(grid[r][c]+wait,time+1),r,c});
                    
                }
            }
        return -1;
    }
}