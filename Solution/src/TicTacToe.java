import model.Board;
import model.Player;

import java.util.Scanner;

public class TicTacToe {
    private Player playingO;
    private Player playingX;
    private Board board;

    public TicTacToe(Player playingO, Player playingX, Board board) {
        this.playingO = playingO;
        this.playingX = playingX;
        this.board = board;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in); // For user input
        boolean isPlayingXTurn = true;
        boolean gameEnded = false;

        System.out.println("Welcome to Tic Tac Toe!");
        board.printBoard();

        while (!gameEnded) {
            Player currentPlayer = isPlayingXTurn ? playingX : playingO;
            System.out.println("It's " + currentPlayer.getName() + "'s (" +
                    (isPlayingXTurn ? "X" : "O") + ") turn.");
            
            System.out.println("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.println("Enter column (0-2): ");
            int col = scanner.nextInt();

            if (board.makeMove(row, col, currentPlayer.getColor())) { // assume `makeMove` handles move validity
                board.printBoard();

                if (board.checkWinner(currentPlayer.getColor())) { // assume `checkWinner` checks for winning condition
                    System.out.println("Congratulations " + currentPlayer.getName() + "! You win!");
                    gameEnded = true;
                } else if (board.isDraw()) {
                    System.out.println("It's a draw!");
                    gameEnded = true;
                }

                // Switch players
                isPlayingXTurn = !isPlayingXTurn;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        System.out.println("Game over. Thanks for playing!");
        scanner.close();
    }
}