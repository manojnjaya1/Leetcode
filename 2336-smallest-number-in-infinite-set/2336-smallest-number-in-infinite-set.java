class SmallestInfiniteSet {
      TreeSet<Integer> st;
    int cur=1;
   // PriorityQueue<Integer> pq;
    public SmallestInfiniteSet() {
        st=new TreeSet<>();
       
    }
    
    public int popSmallest() {
       if(st.size()>0){
           return st.pollFirst();
       }else {
           cur+=1;
           return cur-1;
       }
    }
    
    public void addBack(int num) {
        if(cur>num)st.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */