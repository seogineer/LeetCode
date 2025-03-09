class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] original = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    original[i][j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && original[i][j]) {
                    for (int top = i - 1; top >= 0; top--) {
                        if (!original[top][j])
                            matrix[top][j] = 0;
                    }
                    for (int bottom = i + 1; bottom < matrix.length; bottom++) {
                        if (!original[bottom][j]) 
                            matrix[bottom][j] = 0;
                    }
                    for (int left = j - 1; left >= 0; left--) {
                        if (!original[i][left]) 
                            matrix[i][left] = 0;
                    }
                    for (int right = j + 1; right < matrix[0].length; right++) {
                        if (!original[i][right])
                            matrix[i][right] = 0;
                    }
                }
            }
        }
    }
}