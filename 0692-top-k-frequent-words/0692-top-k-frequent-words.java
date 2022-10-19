class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeSet<Word> ts = new TreeSet<>(new Sort());
        HashMap<String,Integer> tm = new HashMap<>();
        for(String i : words){
            tm.put(i,tm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<String,Integer> map : tm.entrySet()){
            ts.add(new Word(map.getKey(),map.getValue()));
        }
        List<String> ans = new ArrayList<>();
        int count= 0 ;
        for(Word i : ts){
            if(count >= k) break;
            ans.add(i.name);
            count++;
        }
        return ans;
    }
}
class Word{
    String name;
    int count;
    Word(String name,int count){
        this.name = name;
        this.count = count;
    }
}
class Sort implements Comparator<Word>{
    public int compare(Word a,Word b){
        if(a.count == b.count) return a.name.compareTo(b.name);
        return b.count-a.count;
    }
}