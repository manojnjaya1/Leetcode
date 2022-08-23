class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList();
        }
        for(int[] edge:edges){
            graph[edge[0]].add(edge[1]);
             graph[edge[1]].add(edge[0]);
        }
        
        boolean[] visited =new boolean[n];
        for(boolean it:visited){
            it=false;
        }
        return hasPath(graph,source,destination,visited);
    }
    boolean  hasPath( ArrayList<Integer>[] graph,int src,int dest,boolean[] visited){
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(int it : graph[src]){
            if(visited[it]==false){
                if(hasPath(graph,it,dest,visited)){
                    return true;
                }
            }
        }
        return false;
            
    }
}