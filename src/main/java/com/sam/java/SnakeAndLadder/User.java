package com.sam.java.SnakeAndLadder;

import java.util.UUID;

public class User {

    UUID id;
    String userName;
    int currentPosition;
    int score;

    public User(String userName, int score) {
        this.userName = userName;
        this.score = score;
        id = UUID.randomUUID();
        currentPosition = 1;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;

    }
}

