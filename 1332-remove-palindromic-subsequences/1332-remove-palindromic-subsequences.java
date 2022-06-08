class Solution {
    public int removePalindromeSub(String s) {
        int len = s.length();
        if(len == 0) return 0;
        if(new StringBuilder(s).reverse().toString().equals(s)) return 1;
        else return 2;
    }
}