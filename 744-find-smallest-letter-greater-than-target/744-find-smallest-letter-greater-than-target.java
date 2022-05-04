class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        TreeSet<Character> ts = new TreeSet<>();
        for(char i : letters) ts.add(i);
        if(ts.contains(target)) ts.remove(target);
        Character ch = ts.ceiling(target);
        if(ch == null) return ts.first();
        return ch;
    }
}