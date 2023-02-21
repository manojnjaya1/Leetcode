class Solution {
    public int eatenApples(int[] apples, int[] days) {
        int n=apples.length;
        int ans=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0; (i<n || !pq.isEmpty());i++){
             if(i<n){
                pq.add(new int[]{i+days[i],apples[i]});
            }
            
            while(!pq.isEmpty() &&( pq.peek()[0]<=i||pq.peek()[1]<=0)){
                pq.poll();
            }
            if(!pq.isEmpty()){
                ans++;
                pq.peek()[1]--;
            }
            
        }
           
           
return ans;
        }
    }
