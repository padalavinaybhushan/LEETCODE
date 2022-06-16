class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: piles)
        {
            pq.add(i);
        }
        while(k-- > 0)
        {
            int max = pq.peek();
            pq.remove(max);
            int c=1;
            if(max%2 == 0)
                c=0;
            max = (int)Math.floor(max/2);
            max+=c;
            pq.add(max);
        }
        int sum=0;
        for(int i : pq)
        {
            sum+=i;
        }
        return sum;
    }
}