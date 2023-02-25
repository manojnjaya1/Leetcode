class Solution {
    class Std implements Comparable<Std>{
        int point,id;
        
        public Std(int point,int id){
            this.point=point;
            this.id=id;
        }
        
        public int compareTo(Std std){
            return std.point-this.point;
        }
    }
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Set<String> positive =new HashSet<>();
                Set<String> negative =new HashSet<>();
        for(String s:positive_feedback){
            positive.add(s);
        }
         for(String s:negative_feedback){
            negative.add(s);
        }
        int n=report.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[1]==b[1]? Integer.compare(a[0],b[0]):Integer.compare(b[1],a[1]));
        for(int i=0;i<n;i++){
            int pcount=0;
            int ncount=0;
            
            String[] st=report[i].split(" ");
            int m=st.length;
            for(int j=0;j<m;j++){
                if(positive.contains(st[j]))pcount++;
                if(negative.contains(st[j]))ncount++;
            }
            int point=(pcount*3)-(ncount);
            pq.offer(new int[]{student_id[i],point});
            
        }
        
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            int[] cur=pq.poll();
            ans.add(cur[0]);
        }
        
       return ans; 

    }
    
}