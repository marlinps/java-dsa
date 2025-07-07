import java.util.ArrayList;
import java.util.List;

class BacktrackingNQueensSolution {
    public boolean isSafe(int row, int col, char[][] board){
        //horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i=0; i<board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        r = row;
        for(int c=col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col){
        //Base case
        //if column is equal to the length of the board, then we have placed all queens
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row=0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';

            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;

    }

    public static void main(String[] args) {
        BacktrackingNQueensSolution nQueens = new BacktrackingNQueensSolution();
        int n = 4;
        List<List<String>> result = nQueens.solveNQueens(n);
        for(List<String> board : result){
            for(String row : board){
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

/*TODO: Print all possible solutions to the N-Queens problem using backtracking.
 The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
 Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 Input: n = 4
 Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above

 Example 2:
 Input: n = 1
 Output: [["Q"]]
*/