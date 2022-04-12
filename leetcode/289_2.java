class Solution {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int neighbors = count(board, row, col, i, j);

                if (board[i][j] == 1 && neighbors >= 2 && neighbors <= 3) board[i][j] = 3;
                if (board[i][j] == 0 && neighbors == 3) board[i][j] = 2;

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int count(int[][] board, int row, int col, int i, int j) {
        int res = 0;

        for (int k = Math.max(i - 1, 0); k <= Math.min(i + 1, row - 1); k++) {
            for (int l = Math.max(j - 1, 0); l <= Math.min(j + 1, col - 1); l++) {
                res += board[k][l] & 1;
            }
        }

        res -= board[i][j] & 1;
        return res;
    }
}