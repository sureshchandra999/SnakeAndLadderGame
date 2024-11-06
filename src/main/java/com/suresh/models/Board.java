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

       /* for (int i = 1; i < dimension; i++) {
            boardEntities.put(i, new Snake(i, i - 1));
            i++;
            if (i < dimension) {
                boardEntities.put(i, new Ladder(i, i + 1));
            }
        }*/
    }

    private void addSSnakes(){
        for (int i = 1; i < dimension; i++) {
            int min =2;
            int cellCount = 0;//
            int max=cellCount-1;//10
            boardEntities.put(i, new Snake(i, i - 1));
            i++;
        }
    }




    private boolean hasSnakeOrLadder(int index) {
        return boardEntities.containsKey(index);
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
