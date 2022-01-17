class Solution {
    /*
    long sum = 0;
            int first = list.get(0);
            for (int i=1;i<list.size();i++) {
                sum = sum + list.get(i) - first;
            }
            ans[first] = sum;
            
            int prevElements = 0, nextElements = list.size()-2;
            for (int i=1;i<list.size();i++) {
                int diff = list.get(i)-list.get(i-1);
                sum = sum + diff*(prevElements - nextElements);
                ans[list.get(i)] = sum;
                prevElements++;
                nextElements--;
            }
            
        */
    public static ArrayList<Long> fun(int size,ArrayList<Long> tem)
    {
        ArrayList<Long> ans = new ArrayList<>();
        long first = tem.get(0);
        long sum=0;
        for(int i=1;i<size;i++)
        {
            sum = sum + tem.get(i) - first;
        }
        ans.add(sum);
        int prevElements = 0, nextElements = size-2;
        for (int i=1;i<size;i++) {
                long diff = tem.get(i)-tem.get(i-1);
                sum = sum + diff*(prevElements - nextElements);
                ans.add(sum);
                prevElements++;
                nextElements--;
            }
//         for(int i=0;i<size;i++)
//         {
//             long sum=0;
//             for(int j=0;j<size;j++)
//             {
                
//                 if(i!=j)
//                 {
//                     sum += (Math.abs(tem.get(i)-tem.get(j)));
//                 }
//             }
//             ans.add(sum);
            
//         }
        return ans;
    }
    public long[] getDistances(int[] arr) {
        HashMap<Integer,ArrayList<Long>> hm = new HashMap<>();
        HashMap<Integer,Integer> req = new HashMap<>();
        int len = arr.length;
        for(int i=0;i<len;i++ )
        {
            if(hm.containsKey(arr[i]))
            {
                ArrayList<Long> tem = hm.get(arr[i]);
                tem.add((long)i);
                hm.put(arr[i],tem);
            }
            else
            {
                ArrayList<Long> tem = new ArrayList<>();
                tem.add((long)i);
                hm.put(arr[i],tem);
                req.put(arr[i],0);
            }
        }
       
        for(Map.Entry<Integer,ArrayList<Long>> map : hm.entrySet())
        {
            int i = map.getKey();
            ArrayList<Long> tem = map.getValue();
            int size = tem.size();
            hm.put(i,fun(size,tem));
        }
        long[] vin = new long[len];
        int ind=0;
        for(int i=0;i<len;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                vin[ind] = hm.get(arr[i]).get(req.get(arr[i]));
                req.put(arr[i],req.get(arr[i])+1);
                ind++;
            }
        }
        
        return vin;
    }
}