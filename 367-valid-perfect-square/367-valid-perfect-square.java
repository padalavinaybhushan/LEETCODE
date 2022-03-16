class Solution {
    public boolean isPerfectSquare(int num) {
        double sq = Math.sqrt(num);
        int sqint = (int)(sq);
        if(sq-sqint == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}