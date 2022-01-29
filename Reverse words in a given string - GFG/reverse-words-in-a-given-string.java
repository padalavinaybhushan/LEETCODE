// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String st)
    {
        // code here 
        int len = st.length();
        ArrayList<String> arr = new ArrayList<>();
        String str ="";
        for(int i=0;i<len;i++){
            if(st.charAt(i) == '.')
            {
                if(!str.equals(""))
                {
                    arr.add(str);
                }
                arr.add(".");
                str = "";
            }
            else
            {
                str += (Character.toString(st.charAt(i)));
            }
        }
        if(!str.equals(""))
            {
                arr.add(str);
            }
        Collections.reverse(arr);
        String ans ="";
        for(String s : arr)
        {
            ans +=(s);
        }
        return ans;
    }
}