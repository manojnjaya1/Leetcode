class StockPrice {
   TreeMap<Integer, Integer> tm = new TreeMap<>();
        TreeMap<Integer, Set<Integer>> valueTimeStamp = new TreeMap<>();
    public StockPrice() {
        tm = new TreeMap<>();
        valueTimeStamp = new TreeMap<>();
    }
    
    public void update(int timestamp, int price) {
        if(tm.containsKey(timestamp)){//update to existing value - correction
            int oldPrice = tm.get(timestamp);
            valueTimeStamp.get(oldPrice).remove(timestamp);
            if(valueTimeStamp.get(oldPrice).size()==0)//if only one timestamp had the value and it later got updated 
                valueTimeStamp.remove(oldPrice);
        }
        tm.put(timestamp, price);
        valueTimeStamp.putIfAbsent(price, new HashSet<>());
        valueTimeStamp.get(price).add(timestamp);
    }
    
    public int current() {
       return tm.get(tm.lastKey());
    }
    
    public int maximum() {
       return valueTimeStamp.lastKey();
    }
    
    public int minimum() {
       return valueTimeStamp.firstKey();
    }
    }


/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */