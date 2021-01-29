package org.academiadecodigo.carcrash.field;

public class Position {

    // properties for my car position
    private int col;
    private int row;

    // create my constructor
    // initialize my properties with a random number x the size of my field
    public Position() {
        this.col = (int) (Math.random() * Field.getHeight());
        this.row = (int) (Math.random() * Field.getWidth());
    }

    // getter available in the skeleton
    public int getCol() {
        return col;
    }

    // getter available in the skeleton
    public int getRow() {
        return row;
    }
}
