class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(String i : ops)
        {
            if(i.equals("C"))
            {
                int tem = st.pop();
            }
            else if(i.equals("D"))
            {
                int tem = st.peek();
                st.push(2*tem);
            }
            else if(i.equals("+"))
            {
                int tem = st.pop();
                int tem2 = st.peek();
                st.push(tem);
                st.push(tem2+tem);
            }
            else
            {
                int num = Integer.parseInt(i);
                st.push(num);
            }
        }
        int ans = 0;
        while(!st.isEmpty())
        {
            ans += st.pop();
        }
        return ans;
    }
}