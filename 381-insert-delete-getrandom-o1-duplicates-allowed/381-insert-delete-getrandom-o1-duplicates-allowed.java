import java.util.Random.*;
class RandomizedCollection {

    HashMap<Integer,Integer> hm;
    ArrayList<Integer> arr = new ArrayList<>();
    int pos;
    private static final Random rand = new Random();
    public RandomizedCollection() {
        hm = new HashMap<>();
        pos=1;
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
        {
            hm.put(val,hm.get(val)+1);
            arr.add(val);
            return false;
        }
        else
        {
            hm.put(val,1);
            arr.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val))
        {
            hm.put(val,hm.get(val)-1);
            if(hm.get(val) ==0)
            {
                hm.remove(val);
            }
            arr.remove(new Integer(val));
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int getRandom() {
        int index = rand.nextInt(arr.size());
        return arr.get(index);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */