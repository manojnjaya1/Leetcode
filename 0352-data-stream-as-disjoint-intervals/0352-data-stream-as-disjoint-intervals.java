class SummaryRanges {
TreeSet<Integer> nums;
    public SummaryRanges() {
        nums=new TreeSet<>();
    }
    
    public void addNum(int value) {
        nums.add(value);
    }
    
    public List<List<Integer>> getIntervals() {
       // int n=nums.size();
        List<List<Integer>> lis=new ArrayList<>();
        //int[][] intervals=new int[n][2];
        int start=nums.first();
        int end=nums.first();
        
        int i=0;
        for(Integer val:nums.tailSet(nums.first()+1)){
            if(val-end==1){
                end=val;
            }else{
                List<Integer> li=new ArrayList<>();
                li.add(start);
                li.add(end);
                lis.add(new ArrayList(li));
               /* intervals[i][0]=start;
                intervals[i][1]=end;*/
                i++;
                end=start=val;
            }
        }
          List<Integer> li=new ArrayList<>();
                li.add(start);
                li.add(end);
                lis.add(new ArrayList(li));
      /*  intervals[i][0]=start;
        intervals[i][1]=end;*/
        return lis;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */