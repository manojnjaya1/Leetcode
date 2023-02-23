class Solution {
    class Solv implements Comparable<Solv>{
        int profit,capital;
        
        
        public Solv(int profit,int capital){
            this.profit=profit;
            this.capital=capital;
        }
        
        public int compareTo(Solv solv){
            return capital-solv.capital;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        Solv[] projects=new Solv[n];
        
        for(int i=0;i<n;i++){
            projects[i]=new Solv(profits[i],capital[i]);
        }
        Arrays.sort(projects);
        int ptr=0;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<k;i++){
            while(ptr<n && projects[ptr].capital<=w){
                pq.add(projects[ptr++].profit);
            }
            if(pq.isEmpty())break;
            
            w+=pq.poll();
        }
        return w;
    }
}