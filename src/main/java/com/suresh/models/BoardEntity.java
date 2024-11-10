package com.suresh.models;

/**
 * BoardEntity class is an abstract class which is parent class for Snake and Ladder classes.
 * It has two instance variables start and end.
 */

public abstract class BoardEntity {

//instance variables
    int start;
    int end;
    BoardEntityType boardEntityType;

    //constructor
    public BoardEntity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //getter and setter methods
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }

    public BoardEntityType getBoardEntityType() {
        return boardEntityType;
    }

    public void setBoardEntityType(BoardEntityType boardEntityType) {
        this.boardEntityType = boardEntityType;
    }
}
