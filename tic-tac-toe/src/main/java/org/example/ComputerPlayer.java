package org.example;

public class ComputerPlayer implements Player {
    String name;
    private char symbol;
    ComputerPlayer(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public Cell move() {
        Cell cell = new Cell(0, 0);
        cell.setSymbol(this.symbol);
        return cell;
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }
}
