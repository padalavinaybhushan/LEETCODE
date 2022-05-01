class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int len = s.length();
        int len1 = t.length();
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch == '#')
            {
                if(!st1.isEmpty())
                {
                    st1.pop();
                }
            }
            else
            {
                st1.push(ch);
            }
        }
        for(int i=0;i<len1;i++)
        {
            char ch = t.charAt(i);
            if(ch == '#')
            {
                if(!st2.isEmpty())
                {
                    st2.pop();
                }
            }
            else
            {
                st2.push(ch);
            }
        }
         return st1.equals(st2);
    }
}