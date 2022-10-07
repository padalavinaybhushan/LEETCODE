class MyCalendarThree {

   TreeMap<Integer, Integer> tree;
public MyCalendarThree() {
    tree = new TreeMap<>();
}

public int book(int start, int end) {
    
    tree.put(start, tree.getOrDefault(start, 0) + 1);
    tree.put(end, tree.getOrDefault(end, 0) - 1);
    int val = 0;
    int max = 0;
    for(int key : tree.keySet()){
        val += tree.get(key);
        max = Math.max(val, max);
    }
    return max;
}
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */