package com.suresh.models;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private int dimension;
    private Map<Integer, BoardEntity> boardEntities;

    //constructor
    public Board(int dimension) {
        this.dimension = dimension;

        boardEntities = new HashMap<>();
        //initialize n snakes and n ladders
        for (int i = 1; i < dimension; i++) {
            boardEntities.put(i, new Snake(i, i - 1));
            i++;
            if (i < dimension) {
                boardEntities.put(i, new Ladder(i, i + 1));
            }
        }
    }






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
