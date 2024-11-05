package com.suresh.models;

import java.util.Map;

public class Board {

    private int dimension;
    private Map<Integer, BoardEntity> boardEntities;

    //getter and setter methods
    public int getDimension() {
        return dimension;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    public Map<Integer, BoardEntity> getBoardEntities() {
        return boardEntities;
    }
    public void setBoardEntities(Map<Integer, BoardEntity> boardEntities) {
        this.boardEntities = boardEntities;
    }

}
