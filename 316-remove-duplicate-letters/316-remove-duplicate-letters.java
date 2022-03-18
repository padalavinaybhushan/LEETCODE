class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Boolean> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            hm2.put(s.charAt(i),hm2.getOrDefault(s.charAt(i),0)+1);
            hm1.put(s.charAt(i),false);
        }
        int st_size=0;
        for(int i=0;i<len;i++)
        {
            if(st_size == 0)   
            {
                st.push(s.charAt(i));
                hm1.put(s.charAt(i),true);
                hm2.put(s.charAt(i),hm2.get(s.charAt(i))-1);
                st_size++;
            }
            else
            {
                char pre = s.charAt(i);
                if(hm1.get(pre) == false)
                {
                   if(st.peek() < pre)
                {
                    st.push(pre);
                    hm1.put(pre,true);
                    hm2.put(pre,hm2.get(pre)-1);
                       st_size++;
                }
                else
                {
                    while(st_size != 0 && st.peek()>pre)
                    {
                        if(hm2.get(st.peek()) >0)
                        {
                            //hm2.put(st.peek(),hm2.get(st.peek())-1);
                            hm1.put(st.peek(),false);
                            st.pop();
                            st_size--;
                        }
                        else
                        {
                            st.push(pre);
                            hm1.put(pre,true);
                            hm2.put(pre,hm2.get(pre)-1);
                            st_size++;
                            break;
                        }
                    
                    }
                    if(st_size<=0)
                    {
                        st.push(pre);
                        hm1.put(pre,true);
                        hm2.put(pre,hm2.get(pre)-1);
                        st_size=1;
                    }
                    else if(st.peek()<pre)
                    {
                        st.push(pre);
                    hm1.put(pre,true);
                    hm2.put(pre,hm2.get(pre)-1);
                       st_size++;
                    }
                } 
                }
                else
                {
                    hm2.put(pre,hm2.get(pre)-1);
                }
                
            }
        }
        return (new ArrayList<>(st)).stream().map(Object::toString).collect(Collectors.joining(""));
        
    }
}