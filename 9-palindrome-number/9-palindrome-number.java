class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        StringBuffer strb = new StringBuffer(Integer.toString(x));
        strb.reverse();
        long num = Long.parseLong(strb.toString());
        if(num == (long)x) return true;
        else return false;
        
    }
}