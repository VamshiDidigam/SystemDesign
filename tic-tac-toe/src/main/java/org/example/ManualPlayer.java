package org.example;

public class ManualPlayer implements Player{
    String name;
    char symbol;
    ManualPlayer(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Cell move() {
        Cell cell = new Cell(0, 0);
        cell.setSymbol(this.symbol);
        return cell;
    }

    public char getSymbol() {
        return this.symbol;
    }
}
