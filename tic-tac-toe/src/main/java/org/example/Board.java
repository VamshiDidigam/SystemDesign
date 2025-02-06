package org.example;

public class Board {
    Cell[][] grid;
    int size;
    Board (int n) {
        this.size = n;
        grid = new Cell[n][n];
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
    }

    boolean makeMove(Cell cell) {
        grid[cell.x][cell.y] = cell;
        return true;
    }
    boolean isFull() {
        for (int i=0; i<this.size; i++) {
            for(int j=0; j<size; j++) {
                if(grid[i][j].isEmpty()) return false;
            }
        }

        return true;
    }

    void printBoard() {
        for (int i=0; i<this.size; i++) {
            for(int j=0; j<size; j++) {
                System.out.println(" "+ grid[i][j].getSymbol());
            }
            System.out.println("/n");
        }
    }

    boolean isWinner(char symbol) {
        if(checkCol(symbol) || checkRow(symbol) || checkDiag(symbol)) return true;
        return false;
    }

    boolean checkCol(char symbol) {

        return false;
    }

    boolean checkRow(char symbol) {

        return false;
    }

    boolean checkDiag(char symbol) {

        return false;
    }



}
