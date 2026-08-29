package Java;

public class Q79_WordSearch{

    private static final int[][] DIRECTIONS = {
        {-1, 0}, //up
        {1, 0}, //down
        {0, -1}, //left
        {0, 1}, //right 
    };

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == word.charAt(0)){
                    char temp = board[i][j];
                    Mark(board, i, j);
                    if (dfs(board, word, i, j, 0))
                        return true;
                    else
                        Refill(board, i, j, temp);
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][]board, String word, int row, int col, int index){
        // stop condition
        if (index == word.length() - 1)
            return true;

        // check for 4 directions
        for (int[] dir: DIRECTIONS){
            // apply direction\
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < board.length &&
                newCol >= 0 && newCol < board[newRow].length &&
                board[newRow][newCol] == word.charAt(index + 1)
            ){
                char temp = board[newRow][newCol];
                Mark(board, newRow, newCol);
                if(dfs(board, word, newRow, newCol, index + 1))
                    return true;
                else
                    Refill(board, newRow, newCol, temp);
            }
        }

        // if (row > 0 && board[row-1][col] == word.charAt(index + 1)){
        //     char temp = board[row-1][col];
        //     Mark(board, row, col);
        //     if(dfs(board, word, row-1, col, index))
        //         return true;
        //     else
        //         Refill(board, row-1, col, temp);
        // }

        return false;
    }

    public void Mark(char[][]board, int row, int col){
        board[row][col] = '#'; 
    }

    public void Refill(char[][]board, int row, int col, char temp){
        board[row][col] = temp; 
    }
}
