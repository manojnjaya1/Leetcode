class RandomizedSet {
  Set<Integer> set;
    Random ran=new Random();
    public RandomizedSet() {
        set=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean remove(int val) {
        if(!set.isEmpty() && set.contains(val)){
            set.remove(val);
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        int n=set.size();
        int a=0;
        int m=ran.nextInt(n);
        int b=0;
          for(int it:set ){
              
              if(b<m){
                  b++;
                  continue;
              }
              a=it;
              break;
          }
           return a;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */