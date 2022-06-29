class Solution {
    public static void rotate(ArrayList<Object> arr,int start,int end)
    {
        Object tem = arr.get(end);
        for(int i=end-1;i>=start;i--)
        {
            arr.set(i+1,arr.get(i));
        }
        arr.set(start,tem);
    }
    public int[][] reconstructQueue(int[][] people) {
        ArrayList<Object> arr = new ArrayList<>();
        for(int[] tem : people)
        {
            arr.add(new Object(tem[0],tem[1]));
        }
        //System.out.println(arr);
        Collections.sort(arr,new sort_new());
        int size = arr.size();
        for(int i=0;i<size;i++)
        {
            int get_ind = arr.get(i).end;
            rotate(arr,get_ind,i);
        }
//         for(Object tem : arr)
//         {
//             System.out.print(tem.start+" "+tem.end+"  ");
            
//         }
        for(int i=0;i<size;i++)
        {
            people[i][0] = arr.get(i).start;
            people[i][1] = arr.get(i).end;
        }
        return people;
    }
}
class sort_new implements Comparator<Object>
{
    @Override
    public  int compare(Object obj,Object obj2)
    {
        if(obj.start > obj2.start)
        {
            return -1;
        }
        else if(obj.start < obj2.start)
        {
            return 1;
        }
        else
        {
            if(obj.end > obj2.end)
            {
                return 1;
            }
            else if(obj.end < obj2.end)
            {
                return -1;
            }
            else return 1;
        }
       // return 1;
    }
}
class Object
{
    int start,end;
    Object(int start,int end)
    {
        this.start = start;
        this.end = end;
    }
}