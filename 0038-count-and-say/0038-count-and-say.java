class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String str = countAndSay(n-1);
        int len = str.length();
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=Integer.parseInt(str.substring(i,i+1));
        }
        int count=0;
        ArrayList<Integer> tem = new ArrayList<>();
        for(int i=0;i<len-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                tem.add(++count);
                count=0;
                tem.add(arr[i]);
            }
            else
            {
                count++;
            }
        }
            tem.add(++count);
            count=0;
            tem.add(arr[len-1]);
        String ans = "";
        for(int i:tem)
        {
            ans += Integer.toString(i);
        }
        return ans;
    }
}