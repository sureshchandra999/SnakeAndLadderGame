package com.suresh.models;

import com.suresh.utility.DiceUtility;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * This class represents the Game object
 */
public class Game {
    private Board board;
    private Queue<Player> players;
    private Queue<Player> winners;
    private int numberOfDices;
    private int dimension;

    public Game( int numberOfDices, int dimension, Queue<Player> players) {

        this.players = players;
        this.numberOfDices = numberOfDices;
        this.dimension = dimension;
        this.winners = new LinkedList<>();
        this.board = new Board(dimension);

    }
    public void startGame() {
        board.printBoard();

        while(players.size()>1){
            Player currentPlayer = players.poll();
            System.out.println("Player "+currentPlayer.getName()+" is playing");
            System.out.println(currentPlayer.getName()+ "'s turn to roll the dice. ");
            System.out.println("Press Enter 'R' to roll the dice");
            Scanner scanner = new Scanner(System.in);
            char input = scanner.next().charAt(0);
            if(input == 'R' || input == 'r'){
                int diceValue = DiceUtility.rollDice(numberOfDices);
                System.out.println(currentPlayer.getName() + " got "+diceValue+ " on dice.");

                int newPosition = currentPlayer.getCurrentPosition() + diceValue;
                currentPlayer.setCurrentPosition(newPosition);
                //check if there is a ladder or snake in the new position
                if(board.hasSnakeOrLadder(newPosition)){
                    BoardEntity boardEntity = board.getBoardEntities().get(newPosition);
                    if(boardEntity instanceof Snake){
                        Snake snake = (Snake) boardEntity;
                        System.out.println("Oh no! "+currentPlayer.getName()+" got bitten by a snake. "+currentPlayer.getName()+" moved from "+newPosition+" to "+snake.getTail());
                        currentPlayer.setCurrentPosition(snake.getTail());
                    }else if(boardEntity instanceof Ladder){
                        Ladder ladder = (Ladder) boardEntity;
                        System.out.println("Yay! "+currentPlayer.getName()+" found a ladder. "+currentPlayer.getName()+" moved from "+newPosition+" to "+ladder.getHead());
                        currentPlayer.setCurrentPosition(ladder.getHead());
                    }
                }

                System.out.println(currentPlayer.getName() + " rolled a " + diceValue + " and moved from " + (currentPlayer.getCurrentPosition() - diceValue) + " to " + currentPlayer.getCurrentPosition());
                if (newPosition == board.getSize()) {
                    winners.add(currentPlayer);
                }else{
                    players.add(currentPlayer);
                }
            }









        }

        /*while (winners.isEmpty()) {
            for (Player player : players) {
                int diceValue = DiceUtility.rollDice(numberOfDices);
                int newPosition = player.getCurrentPosition() + diceValue;
                player.setCurrentPosition(newPosition);
                if (newPosition == board.getSize()) {
                    winners.add(player);
                }
            }
        }*/
    }
}
