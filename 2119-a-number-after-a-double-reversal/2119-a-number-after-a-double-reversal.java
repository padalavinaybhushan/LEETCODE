class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuffer str = new StringBuffer(Integer.toString(num));
        str.reverse();
        int tem = Integer.parseInt(str.toString());
        str = new StringBuffer(Integer.toString(tem));
        str.reverse();
        tem = Integer.parseInt(str.toString());
        if(num == tem)
        {
            return true;
        }
        return false;
        
    }
}