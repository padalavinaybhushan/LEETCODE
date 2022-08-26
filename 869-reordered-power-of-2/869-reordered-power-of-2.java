class Solution {
    public static boolean check(int n,HashMap<Integer,Integer> hm){
        HashMap<Integer,Integer> tem = new HashMap<>();
        while(n!=0){
            tem.put(n%10,tem.getOrDefault(n%10,0)+1);
            n=n/10;
        }
        return tem.equals(hm);
    }
    public static int msb_(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n>>1;
        }
        return count-1;
    }
    public boolean reorderedPowerOf2(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int tem = n;
        while(tem != 0){
            arr.add(tem%10);
            hm.put(tem%10,hm.getOrDefault(tem%10,0)+1);
            tem=tem/10;
        }
        Collections.sort(arr);
        StringBuilder str = new StringBuilder("");
        StringBuilder rev = new StringBuilder("");
        int size = arr.size();
        int count=0;
        for(int i=0,j=size-1;i<size;i++,j--){
            rev.append(Integer.toString(arr.get(j)));
            if(arr.get(i) == 0){
                count++;
            }
            else{
                str.append(Integer.toString(arr.get(i)));
                while(count-- > 0) str.append("0");
            }
        }
        int start = Integer.parseInt(str.toString());
        int end = Integer.parseInt(rev.toString());
        int msb = 1<<msb_(start);
        //System.out.println(Integer.toBinaryString(msb));
        //System.out.println(Integer.toBinaryString(start));
        while(msb<=end){
            if(check(msb,hm)) return true;
            msb=msb<<1;
        }
        return false;

    }
}