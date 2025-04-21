package model;

public abstract class Piece {
    private PlayingPieceColor color;

    protected Piece(PlayingPieceColor color) {
        this.color = color;
    }
    
    public PlayingPieceColor getColor() {
        return color;
    }

    public void setColor(PlayingPieceColor color) {
        this.color = color;
    }
}