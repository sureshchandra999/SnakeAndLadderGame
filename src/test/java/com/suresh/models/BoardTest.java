package com.suresh.models;

// File: src/test/java/com/suresh/models/BoardTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;


class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board(10);
    }

    @Test
    void testGetDimension() {
        assertEquals(10, board.getDimension(), "Dimension should be 10");
    }

    @Test
    void testSetDimension() {
        board.setDimension(15);
        assertEquals(15, board.getDimension(), "Dimension should be 15");
    }

    @Test
    void testGetBoardEntities() {
        Map<Integer, BoardEntity> boardEntities = board.getBoardEntities();
        assertNotNull(boardEntities, "Board entities should not be null");
    }

   /* @Test
    void testSetBoardEntities() {
        Map<Integer, BoardEntity> newBoardEntities = Map.of(1, new Snake(1, 0));
        board.setBoardEntities(newBoardEntities);
        assertEquals(newBoardEntities, board.getBoardEntities(), "Board entities should be updated");
    }*/

    @Test
    void testHasSnakeOrLadder() {
        board.getBoardEntities().put(1, new Snake(1, 0));
        assertTrue(board.hasSnakeOrLadder(1), "There should be a snake or ladder at position 1");
        assertFalse(board.hasSnakeOrLadder(2), "There should not be a snake or ladder at position 2");
    }
}