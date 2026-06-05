package week_1.Day_4;
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        int newRow = 0;
        int newCol = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[newRow][newCol] = mat[i][j];

                newCol++;

                if (newCol == c) {
                    newCol = 0;
                    newRow++;
                }
            }
        }

        return ans;
    }
}