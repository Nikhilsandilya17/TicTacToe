package model;

public class Board {
    private char[][] board;
    private int size;

    public Board(int size) {
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }

        this.size = size;
    }


    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col, PlayingPieceColor color) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        board[row][col] = color == PlayingPieceColor.X ? 'X' : 'O';
        return true;
    }

    public boolean isDraw() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWinner(PlayingPieceColor piece) {
        //check for rows and cols
        char color = piece == PlayingPieceColor.X ? 'X' : 'O';
        for (int i = 0; i < board.length; i++) {
            if ((board[0][i] == color && board[1][i] == color && board[2][i] == color) || (board[i][0] == color
                    && board[i][1] == color && board[i][2] == color)) {
                return true;
            }
        }
        //check for diagonals
        return ((board[0][0] == color && board[1][1]== color && board[2][2] == color) || (board[0][2] == color && board[1][1] == color && board[2][0] == color));
    }

}
