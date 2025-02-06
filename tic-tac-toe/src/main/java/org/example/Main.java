package org.example;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(3, PlayerType.MANUAL, PlayerType.COMPUTER);
        game.play();
        System.out.println("Hello world!");
    }
}