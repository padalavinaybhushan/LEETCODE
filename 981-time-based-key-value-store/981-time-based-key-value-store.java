class TimeMap {
    HashMap<String,time> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(hm.containsKey(key)){
            time obj = hm.get(key);
            obj.hm.put(timestamp,value);
            obj.ts.add(timestamp);
        }
        else{
            time obj = new time();
            obj.hm.put(timestamp,value);
            obj.ts.add(timestamp);  
            hm.put(key,obj);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)) return "";
        Integer floor = hm.get(key).ts.floor(timestamp);
        if(floor == null){
            return "";
        }
        return hm.get(key).hm.get(floor);
    }
}
class time{
    HashMap<Integer,String> hm = new HashMap<>();
    TreeSet<Integer> ts =  new TreeSet<>();
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */