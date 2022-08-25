class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        int len1 = ransomNote.length();
        int len2= magazine.length();
        for(int i=0;i<len1;i++){
            char ch = ransomNote.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<len2;i++){
            char ch = magazine.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> map: hm1.entrySet()){
            char ch = map.getKey();
            int val =  map.getValue();
            if(val>hm2.getOrDefault(ch,0)) return false;
        }
        return true;
        
    }
}