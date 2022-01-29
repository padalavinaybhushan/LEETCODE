class Solution {   
    class Pair{
        int x,y;
    }
    public int largestRectangleArea(int[] h) {
        if(h.length == 0) return 0;
        if(h.length == 1) return h[0];
        Pair[] p = new Pair[h.length];
        for(int i=0;i<p.length;i++)
            p[i] = new Pair();
        Stack<Integer> st = new Stack<Integer>();
        // Find Nearest Smallest to Left
        for(int i=0;i<h.length;i++){
            if(st.isEmpty()){
                p[i].x = -1;
            }
            else if(h[st.peek()] < h[i]){
                p[i].x = st.peek();
            }
            else{
                while(!st.isEmpty() && h[st.peek()] >= h[i])
                    st.pop();
                if(st.isEmpty())
                    p[i].x = -1;
                else p[i].x = st.peek();
            }
            st.add(i);
        }
        
        st.clear();
		
		// Find Nearest Smallest to Right
        for(int i=h.length-1;i>=0;i--){
            if(st.isEmpty()) p[i].y = h.length;
            else if(h[i] > h[st.peek()]) p[i].y = st.peek();
            else {
                while(!st.isEmpty() && h[i] <= h[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty())
                    p[i].y = h.length;
                else p[i].y = st.peek();
            }
            st.add(i);
        }
        int ans = 0;
        for(int i=0;i<p.length;i++){
            ans = Math.max(ans, h[i]*(p[i].y-p[i].x-1));
        }
        return ans;
    }
}