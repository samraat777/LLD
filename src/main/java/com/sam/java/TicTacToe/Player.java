package com.sam.java.TicTacToe;

public class Player {
    int id;
    PlayingPiece playingPiece;

    public Player(int id, PlayingPiece playingPiece) {
        this.id = id;
        this.playingPiece = playingPiece;
    }

    public int getId() {
        return id;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}
