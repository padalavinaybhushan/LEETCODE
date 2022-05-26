public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        int len = bin.length(),count=0;
        for(int i=0;i<len;i++) if(bin.charAt(i) == '1') count++;
        return count;
    }
}