class Solution {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = judgeLiveOrDie(board, i, j);
                if (board[i][j] == 1) {
                    if (count < 2 || count > 3) {
                        board[i][j] = 3;
                    }
                } else {
                    if (count == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    private int judgeLiveOrDie(int[][] board, int i, int j) {
        int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
        int[] dy = {1, -1, 1, 0, -1, 1, -1, 0};
        int count = 0;
        for (int d = 0; d < 8; d++) {
            int nx = j + dx[d];
            int ny = i + dy[d];
            if (nx >= 0 && nx < board[0].length && ny >= 0 && ny < board.length) {
                if (board[ny][nx] == 1 || board[ny][nx] == 3) {
                    count++;
                }
            }
        }
        return count;
    }
}