class MedianFinder {
    
    PriorityQueue<Integer> g;
    PriorityQueue<Integer> s;
    public MedianFinder() {
        g = new PriorityQueue<>();
        s = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(s.size() == 0) 
        {   
            s.add(num);
            return;
        }
        if(s.size() > g.size())
        {
            if(s.peek() > num)
            {
                g.add(s.poll());
                s.add(num);
            }
            else
            {
                g.add(num);
            }
        }
        else
        {
            if(num <= s.peek())
            {
                s.add(num);
            }
            else
            {
                g.add(num);
                s.add(g.poll());
            }
        }
    }
    
    public double findMedian() {
        int s1= s.size();
        int g1 = g.size();
        if((s1+g1)%2 == 1)
        {
            return (double)(s.peek());
        }
        else
        {
            return ((double)s.peek()+g.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */