class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer,Node> hm = new HashMap<>();
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        HashSet<Integer> uni = new HashSet<>();
        for(int[] i : adjacentPairs){
            Node a = hm.getOrDefault(i[0],new Node(i[0]));
            Node b = hm.getOrDefault(i[1],new Node(i[1]));
            hm.put(i[0],a);hm.put(i[1],b);
            a.arr.add(i[1]);b.arr.add(i[0]);
            min = Math.min(min,Math.min(i[0],i[1]));
            max = Math.max(max,Math.max(i[0],i[1]));
            uni.add(i[0]);
            uni.add(i[1]);
        }
        int start = -1;
        for(int i:uni){
             System.out.println(i+" "+hm.get(i).arr);
            if(hm.get(i).arr.size() == 1) {
                start = i;
                break;
            }
        }
        System.out.println(start+" "+min+" "+max);
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int next =start;
        boolean flag = true;
        while(flag){
            flag = false;
            hs.add(next);
            ans.add(next);

            for(int k : hm.get(next).arr){
                if(!hs.contains(k)){
                    flag = true;
                    next = k;
                }
            }
            
        }
        System.out.println(ans);
        int size = ans.size();
        int[] fin = new int[size];
        for(int i=0;i<size;i++) fin[i] = ans.get(i);
        return fin;
    }
}
class Node{
    int n;
    ArrayList<Integer> arr;
    Node(int n){
        this.n = n;
        arr = new ArrayList<>();
    }
}