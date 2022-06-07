class Solution {
    public String sortSentence(String str) {
        String[] arr = str.split(" ");
        int n = arr.length;
        HashMap<String,ArrayList<Integer>> hm = new HashMap<>();
        for(String i : arr)
        {
            int len = i.length();
            int ind=0;
            for(int j=0;j<len;j++)
            {
                if(i.charAt(j) >= '0' && i.charAt(j)<='9') 
                {
                    ind=j;
                    break;
                }
            }
            ArrayList<Integer> tem = new ArrayList<>();
            tem.add(Integer.parseInt(i.substring(ind)));
            tem.add(ind);
            hm.put(i,tem);
        }
        for(Map.Entry<String,ArrayList<Integer>> map : hm.entrySet())
        {
            arr[map.getValue().get(0)-1] = map.getKey().substring(0,map.getValue().get(1));
        }
        StringBuffer strb = new StringBuffer("");
        for(int i=0;i<n;i++)
        {
            if(i == n-1) strb.append(arr[n-1]);
            else strb.append(arr[i]+" ");
        }
        return strb.toString();
    }
}