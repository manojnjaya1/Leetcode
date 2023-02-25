class SmallestInfiniteSet {
      TreeSet<Integer> st;
   // PriorityQueue<Integer> pq;
    public SmallestInfiniteSet() {
        st=new TreeSet<>();
        for(int i=1;i<=1000;i++)st.add(i);
    }
    
    public int popSmallest() {
       return st.pollFirst();
    }
    
    public void addBack(int num) {
        if(!st.contains(num))
        st.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */