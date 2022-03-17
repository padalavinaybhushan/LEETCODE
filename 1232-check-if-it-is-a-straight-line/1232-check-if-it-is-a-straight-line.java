class Solution {
    public static double slope(int x1,int y1,int x2,int y2)
    {
        //System.out.println((y2-y1) +" "+ (x2-x1));
        return (x2-x1) == 0 ? (double)Integer.MAX_VALUE : ((double)(y2-y1)/(x2-x1));
    }
    public boolean checkStraightLine(int[][] cord) {
        int x1 = cord[0][0];
        int y1 = cord[0][1];
        int x2 = cord[1][0];
        int y2 = cord[1][1];
        double slo = slope(x1,y1,x2,y2);
        //System.out.println( slope(x1,y1,x2,y2));
        int len = cord.length;
        for(int i=2;i<len;i++)
        {
            //System.out.println( slope(x1,y1,cord[i][0],cord[i][1]));
            if(slo != slope(x1,y1,cord[i][0],cord[i][1]))
            {
                return false;
            }
        }
        return true;
    }
}