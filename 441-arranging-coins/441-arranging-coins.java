class Solution {
    public int arrangeCoins(int n) {
        long tem = n;
        return (int)(Math.sqrt(1+(8*tem))-1)/2;
    }
}