class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int index, int i, int j, boolean[][] visited) {
        if (index == word.length()) return true;
        if (i < 0 || j < 0 || i > board.length-1 || j > board[0].length-1 || visited[i][j] == true || board[i][j] != word.charAt(index)) return false;

        visited[i][j] = true;

        boolean result = dfs(board, word, index + 1, i + 1, j, visited) ||
                        dfs(board, word, index + 1, i - 1, j, visited) ||
                        dfs(board, word, index + 1, i, j + 1, visited) ||
                        dfs(board, word, index + 1, i, j - 1, visited);
        
        visited[i][j] = false;
        return result;
    }
}