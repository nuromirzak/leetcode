class Solution {
    public boolean isValidSudoku(char[][] arr) {
        // Checking every horizontal line
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] != '.') {
                    if (!set.add(arr[i][j])) return false;
                }
            }
        }

        // Checking every vertical line
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (arr[j][i] != '.') {
                    if (!set.add(arr[j][i])) return false;
                }
            }
        }

        // Checking every sub-box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (arr[i + k][j + l] != '.') {
                            if (!set.add(arr[i + k][j + l])) return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}