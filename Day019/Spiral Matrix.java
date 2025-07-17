class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        spiralHelper(matrix, 0, 0, matrix.length, matrix[0].length, result);
        return result;
    }

    private void spiralHelper(int[][] matrix, int rowStart, int colStart, int rowEnd, int colEnd, List<Integer> result) {
        if (rowStart >= rowEnd || colStart >= colEnd) return;

        // Top row
        for (int col = colStart; col < colEnd; col++) {
            result.add(matrix[rowStart][col]);
        }

        // Right column
        for (int row = rowStart + 1; row < rowEnd; row++) {
            result.add(matrix[row][colEnd - 1]);
        }

        // Bottom row (if not same as top row)
        if (rowEnd - 1 > rowStart) {
            for (int col = colEnd - 2; col >= colStart; col--) {
                result.add(matrix[rowEnd - 1][col]);
            }
        }

        // Left column (if not same as right column)
        if (colEnd - 1 > colStart) {
            for (int row = rowEnd - 2; row > rowStart; row--) {
                result.add(matrix[row][colStart]);
            }
        }

        // Recurse into inner layer
        spiralHelper(matrix, rowStart + 1, colStart + 1, rowEnd - 1, colEnd - 1, result);
    }
}