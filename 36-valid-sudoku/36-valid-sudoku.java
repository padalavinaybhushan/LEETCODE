class Solution {
    public static boolean check(int i,int j,char[][] board)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int t=i;t<i+3;t++)
        {
            for(int c=j;c<j+3;c++)
            {
                char ch = board[t][c];
                if(ch == '.') continue;
                int temp = Integer.parseInt(Character.toString(ch));
                if(hs.contains(temp))
                    return false;
                else
                    hs.add(temp);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int row  = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++)
        {
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<col;j++)
            {
                char ch = board[i][j];
                if(ch == '.') continue;
                int temp = Integer.parseInt(Character.toString(ch));
                if(hs.contains(temp))
                    return false;
                else
                    hs.add(temp);
            }
            hs.clear();
            for(int j=0;j<col;j++)
            {
                char ch = board[j][i];
                if(ch == '.') continue;
                int temp = Integer.parseInt(Character.toString(ch));
                if(hs.contains(temp))
                    return false;
                else
                    hs.add(temp);
            }
        }
        for(int i=0;i<row;i+=3)
        {
            for(int j=0;j<col;j+=3)
            {
                if(check(i,j,board) == false) return false;
            }
        }
        return true;
    }
}