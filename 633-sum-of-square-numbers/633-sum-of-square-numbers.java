class Solution {
    public boolean judgeSquareSum(int c) {
        long end = (int)Math.floor(Math.sqrt(c));
        long start = 0;
        long tem =c;
        while(start<=end)
        {
            long sum = start*start + end*end;
            if(sum == tem) return true;
            else if(sum < tem)  start++;
            else end--;
        }
        return false;
    }
}