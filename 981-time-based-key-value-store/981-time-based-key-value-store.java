class Data{
    int ts;
    String val;
     
    Data(int ts,String val){
        this.ts=ts;
        this.val=val;
    }
}

class TimeMap {
  HashMap<String,List<Data>> map;
    public TimeMap() {
        map=new HashMap<String,List<Data>>();
    }
    
    public void set(String key, String value, int timestamp){
        if(!map.containsKey(key))map.put(key,new ArrayList<Data>());
        map.get(key).add(new Data(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))return "";
        return binarySearch(map.get(key),timestamp);
    }
    
    String binarySearch(List<Data> list,int time ){
        int low=0;
        int high=list.size()-1;
        while(low<high){
            int mid=low+high>>1;
            if(list.get(mid).ts==time)return list.get(mid).val;
            if(list.get(mid).ts<time){
                if(list.get(mid+1).ts>time)return list.get(mid).val;
                low=mid+1;
            }
            else high=mid-1;
        }
        return list.get(low).ts<=time?list.get(low).val:"";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */