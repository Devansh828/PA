class Solution {

    boolean help(char[][] board, String word, int row, int col, int i, boolean[][] visiter) {
        int rows = board.length;
        int columns = board[0].length;

        if(row < 0 || col < 0 || row >= rows || col >= columns) return false;

        if(board[row][col] != word.charAt(i) || visiter[row][col]) return false;

        if(i == word.length()-1) return true;

        visiter[row][col] = true;

        boolean found = 
            help(board, word, row-1, col, i+1, visiter) ||
            help(board, word, row+1, col, i+1, visiter) ||
            help(board, word, row, col+1, i+1, visiter) ||
            help(board, word, row, col-1, i+1, visiter);

        visiter[row][col] = false;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] visiter = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean ans = help(board, word, i, j, 0, visiter);
                    if(ans) return true;
                }
            }
        }

        return false;
    }
}