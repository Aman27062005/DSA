class Solution {

    public void solveSudoku(char[][] board) 
    {
        sudokusolver(board, 0, 0);
    }

    public static boolean sudokusolver(char[][] board, int row, int col) {

        if (row == 9 && col==0) 
        {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) 
        {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Already filled
        if (board[row][col] != '.') {
            return sudokusolver(board, nextRow, nextCol);
        }

        for (char digit = '1'; digit <= '9'; digit++) {

            if (isSafe(board, row, col, digit)) {

                board[row][col] = digit;

                if (sudokusolver(board, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }


    public static boolean isSafe(char[][] board,int row,int col,char digit) 
    {

        // Check column
        for (int i = 0; i < 9; i++) 
        {
            if (board[i][col] == digit) 
            {
                return false;
            }
        }

        // Check row
        for (int i = 0; i < 9; i++) 
        {
            if (board[row][i] == digit) 
            {
                return false;
            }
        }

        // Starting position of 3x3 box
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // Check box
        for (int i = sr; i < sr + 3; i++) 
        {
            for (int j = sc; j < sc + 3; j++) 
            {

                if (board[i][j] == digit) 
                {
                    return false;
                }
            }
        }

        return true;
    }
}