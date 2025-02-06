package org.example;

public class Game {
    Board board;
    Player player1;
    Player player2;
    boolean turn;

    Game(int n, PlayerType playerType1, PlayerType playerType2) {
        board = new Board(n);
        this.turn = false;
        if(playerType1.equals(PlayerType.MANUAL)) {
            player1 = new ManualPlayer("player1", 'X');
        } else {
            player1 = new ComputerPlayer("player1", 'X');
        }

        if(playerType2.equals(PlayerType.MANUAL)) {
            player2 = new ManualPlayer("player2", 'O');
        } else {
            player2 = new ComputerPlayer("player2", 'O');
        }
    }

    void play() {
        while(!board.isFull()) {
            Cell cell;
            if(turn) {
                cell = player1.move();
                board.makeMove(cell);
                if(board.isWinner(player1.getSymbol())) {
                    System.out.println("player1 won");
                }
            } else {
                cell = player2.move();
                board.makeMove(cell);
                if(board.isWinner(player2.getSymbol())) {
                    System.out.println("player1 won");
                }
            }
            turn = !turn;
        }
    }

}
