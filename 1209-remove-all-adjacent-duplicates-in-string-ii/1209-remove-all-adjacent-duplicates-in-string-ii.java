class charcount
{
    int count;
    char ch;
    charcount(char ch,int count)
    {
        this.count = count;
        this.ch = ch;
    }
}


class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<charcount> st = new Stack<>();
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek().ch == ch)
            {
                st.peek().count++;
                if(st.peek().count == k)
                {
                    st.pop();
                }
            }
            else
            {
                charcount obj = new charcount(ch,1);
                st.push(obj);
            }
        }
        StringBuffer tem = new StringBuffer("");
        while(!st.isEmpty())
        {
            charcount obj = st.pop();
            int con = obj.count;
            for(int i=0;i<con;i++) tem.append(Character.toString(obj.ch));
        }
        tem.reverse();
        return tem.toString();
    }
}