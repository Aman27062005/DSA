import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nQueens(board, 0, ans);

        return ans;
    }


    public static void nQueens(char[][] board, int row,
                               List<List<String>> ans) {

        // All queens have been placed
        if (row == board.length) {

            List<String> solution = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                solution.add(new String(board[i]));
            }

            ans.add(solution);

            return;
        }


        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                // Place queen
                board[row][j] = 'Q';

                // Recursive call
                nQueens(board, row + 1, ans);

                // Backtracking
                board[row][j] = '.';
            }
        }
    }


    public static boolean isSafe(char[][] board, int row, int col) {

        // Check vertically upward
        for (int i = row - 1; i >= 0; i--) {

            if (board[i][col] == 'Q') {
                return false;
            }
        }


        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }


        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}