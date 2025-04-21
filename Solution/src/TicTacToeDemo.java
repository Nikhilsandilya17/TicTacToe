import model.Board;
import model.Player;
import model.PlayingPieceColor;

public class TicTacToeDemo {
    public static void main(String[] args) {
        Player playingX = new Player(PlayingPieceColor.X, "Nikhil");
        Player playingO = new Player(PlayingPieceColor.O, "Sandy");

        Board board = new Board(3);

        TicTacToe ticTacToe = new TicTacToe(playingO, playingX, board);
        ticTacToe.play();



    }
}
