package com.suresh.models;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Board class represents the game board.
 * It contains the dimension of the board and the snakes and ladders on the board.
 */
public class Board {
    //create a logger object
    Logger logger = Logger.getLogger(Board.class.getName());
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




    boolean hasSnakeOrLadder(int index) {
        return boardEntities.containsKey(index);
        }

      //print the board like this:: if the ladder or snake is present in the cell then print the start and end of the snake or ladder
    //if the cell is empty then print the cell number
    //if the snake is present in the cell then print the start and end of the snake like this: 98S(78)
    //if the snake is present in the cell then print the start and end of the snake like this: 45S(35)
//if the ladder is present in the cell then print the start and end of the ladder like this: 55L(78)
    //if the ladder is present in the cell then print the start and end of the ladder like this: 11L(38)

        /*
        print the board like this::
        100 99 98S(78) 97 96 95 94 93 92 91
        81 82 83 84 85 86 87 88 89 90
        80 79 78 77 76 75 74 73 72 71
        61 62 63 64 65 66 67 68 69 70
        60 59 58 57 56 55L(78) 54 53 52 51
        41 42 43 44 45S(35) 46 47 48 49 50
        40 39 38 37 36 35 34 33 32 31
        21 22 23 24 25 26 27 28 29 30
        20 19 18 17 16 15 14 13 12 11L(38)
         1  2  3  4  5  6  7  8  9 10


         */
        public void printBoard(){
            int cellCount = dimension*dimension;
            int min =2;
            int max=cellCount-1;//10
            int count = 0;
            for (int i = 1; i <= cellCount; i++) {
                if(i%dimension==0){
                    System.out.println(i);
                }else{
                    System.out.print(i+" ");
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
