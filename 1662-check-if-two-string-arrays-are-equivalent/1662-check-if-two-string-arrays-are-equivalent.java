class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character> a2 = new ArrayList<>();
        for(String i : word1){
            int len = i.length();
            for(int j=0;j<len;j++) a1.add(i.charAt(j));
        }
        for(String i : word2){
            int len = i.length();
            for(int j=0;j<len;j++) a2.add(i.charAt(j));
        }
        return a1.equals(a2);
    }
}