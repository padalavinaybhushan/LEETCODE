class Solution {
    public int minCost(String colors, int[] neededTime) {
        Stack<Ballon> st = new Stack<>();
        int n = neededTime.length;
        for(int i=0;i<n;i++){
            char ch = colors.charAt(i);
            if(i==0){
                Ballon b = new Ballon(ch,neededTime[i]);
                st.push(b);
            }
            else{
                if(ch == st.peek().ch){
                    st.peek().arr.add(neededTime[i]);
                }
                else{
                    Ballon b = new Ballon(ch,neededTime[i]);
                    st.push(b);
                }
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            Ballon b = st.pop();
            int size = b.arr.size();
            if(size >1){
                int ind = b.arr.indexOf(Collections.max(b.arr));
                for(int i=0;i<size;i++){
                    ans+=(i!=ind)?b.arr.get(i):0;
                }
            }
        }
        return ans;
    }
}
class Ballon{
    char ch;
    ArrayList<Integer> arr ;
    Ballon(char ch,int time){
        this.ch= ch;
        arr = new ArrayList<>();
        arr.add(time);
    }
}