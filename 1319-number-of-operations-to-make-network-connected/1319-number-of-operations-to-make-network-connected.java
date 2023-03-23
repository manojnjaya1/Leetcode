class Solution {
       LinkedList<Integer>[] adj;
    public int makeConnected(int n, int[][] c) {
        
         ArrayList<ArrayList<Integer> > components
        = new ArrayList<>();
    adj = new LinkedList[n];
           for (int i = 0; i < n; i++)
            adj[i] = new LinkedList();
        for(int i=0;i<c.length;i++){
            adj[c[i][0]].add(c[i][1]);
            adj[c[i][1]].add(c[i][0]);

        }
         boolean[] visited = new boolean[n];
 
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            if (!visited[i]) {
                DFSUtil(i, visited, al);
                components.add(al);
            }
        }
        int no=components.size();
        int edge=c.length;
        if(c.length<n-1)return -1;
        return no-1;
        
    
    }
    void DFSUtil(int v, boolean[] visited,
                 ArrayList<Integer> al)
    {
        visited[v] = true;
        al.add(v);
        // System.out.print(v + " ");
        Iterator<Integer> it = adj[v].iterator();
 
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFSUtil(n, visited, al);
        }
    }
}