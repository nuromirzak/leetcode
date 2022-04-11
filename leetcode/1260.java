class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();

        int row = grid.length;
        int col = grid[0].length;
        int n = row * col;
        k %= n;
        int l = (k == 0) ? 0 : n - k;

        for (int i = 0; i < row; i++) {
            List<Integer> curRow = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                curRow.add(grid[l / col][l % col]);
                l++;
                if (l == n) {
                    l = 0;
                }
            }
            res.add(curRow);
        }

        return res;
    }
}