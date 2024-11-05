package com.suresh.models;

public abstract class BoardEntity {
    int start;
    int end;

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

}
