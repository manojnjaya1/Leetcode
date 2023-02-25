class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=tasks.length;
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        
        for(int i:map.values()){
           if(i==1)return -1;
            if(i%3==0)count+=i/3;
            else count+=i/3+1;
        }
        return count;
    }
}