class Solution {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;

        int[][] dup = new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                dup[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int neighbors = 0;

                for (int k = -1; k < 2; k++)
                {
                    for (int l = -1; l < 2; l++)
                    {
                        // Check if micro-organism is outside rows
                        if (i + k < 0 || i + k >= row)
                        {
                            continue;
                        }
                        // Check if micro-organism is outside columns
                        if (j + l < 0 || j + l >= col)
                        {
                            continue;
                        }
                        // Checking for self-neighborhood
                        if (k == 0 && l == 0)
                        {
                            continue;
                        }
                        // Otherwise add to neighbors
                        if (dup[i + k][j + l] == 1) neighbors++;
                    }
                }
                // Under-population
                if (neighbors < 2) board[i][j] = 0;
                    // Over-population
                else if (neighbors > 3) board[i][j] = 0;
                    // Reproduction
                else if (neighbors == 3 && dup[i][j] == 0) board[i][j] = 1;
            }
        }
    }
}