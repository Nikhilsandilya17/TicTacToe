package model;

public class Player {
    private PlayingPieceColor color;
    private String name;

    public Player(PlayingPieceColor color, String name) {
        this.color = color;
        this.name = name;
    }

    public PlayingPieceColor getColor() {
        return color;
    }

    public void setColor(PlayingPieceColor color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
