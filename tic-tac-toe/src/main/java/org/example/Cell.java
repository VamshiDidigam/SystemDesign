package org.example;

public class Cell {
    int x;
    int y;
    private char symbol;

    Cell(int x, int y) {
        this.symbol = '-';
        this.x = x;
        this.y = y;
    }

    boolean isEmpty() {
        return symbol=='-';
    }

    char getSymbol() {
       return this.symbol;
    }

    void setSymbol(char ch) {
        this.symbol = ch;
    }
}
