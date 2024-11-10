package com.suresh;

import com.suresh.models.Game;
import com.suresh.models.Player;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Number of dices, Dimension, Players
        int numberOfDices = 1;
        int dimension = 10;

        Player player1 = new Player("Suresh");
        Player player2 = new Player("Ramesh");


        Queue<Player> players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        Game game = new Game(numberOfDices, dimension, players);


        public void startGame() {
            bo
            while (game.getWinners().isEmpty()) {
                for (Player player : game.getPlayers()) {
                    int diceValue = DiceUtility.rollDice(game.getNumberOfDices());
                    int newPosition = player.getCurrentPosition() + diceValue;
                    player.setCurrentPosition(newPosition);
                    if (newPosition == game.getBoard().getSize()) {
                        game.getWinners().add(player);
                    }
                }
            }
        }

    }

}
