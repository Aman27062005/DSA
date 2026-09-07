class Solution 
{
    int count = 0;
    public int totalNQueens(int n)
    {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
        {
            Arrays.fill(board[i], '.');
        }
        nQueens(board, 0);
        return count;
    }
    public void nQueens(char[][] board, int row)
    {
        // All queens placed
        if (row == board.length)
        {
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++)
        {
            if (isSafe(board, row, col))
            {
                // Choose
                board[row][col] = 'Q';
                // Explore
                nQueens(board, row + 1);
                // Unchoose
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col)
    {
        // Check column
        for (int i = row - 1; i >= 0; i--)
        {
            if (board[i][col] == 'Q')
            {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;i >= 0 && j >= 0;i--, j--)
        {
            if (board[i][j] == 'Q')
            {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++)
        {
            if (board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
}