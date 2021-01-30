package org.academiadecodigo.carcrash.field;

public class Position {

    // properties for my car position
    private int col;
    private int row;

    // create my constructor
    // initialize my properties with a random number x the size of my field
    public Position() {
        this.col = (int) (Math.random() * Field.getWidth());
        this.row = (int) (Math.random() * Field.getHeight());
    }

    // methods to move cars
    public void moveRight() {
        if (col + 1 < Field.getWidth()) {
            col++;
        } else {
            col = Field.getWidth() - 1;
        }
    }

    public void moveLeft() {
        if (col - 1 > 0) {
            col--;
        } else {
            col = 0;
        }
    }

    public void moveDown() {
        if (row + 1 < Field.getHeight()) {
            row++;
        } else {
            row = Field.getHeight() - 1;
        }
    }

    public void moveUp() {
        if (row - 1 > 0) {
            col--;
        } else {
            col = 0;
        }
    }

    public void moveWithinLimit() {

        // cars will move in random directions
        int randomDirections = (int) (Math.random() * 4);
        // assign directions to random
        switch (randomDirections) {
            case 0:
                moveRight();
                break;
            case 1:
                moveLeft();
                break;
            case 2:
                moveDown();
                break;
            default:
                moveUp();
                break;
        }
    }

    // compare cars position - to be called in game
    public boolean checkPosition(Position pos) {
        return col == pos.getCol() && row == pos.getRow();
    }

    // getter available in the skeleton -> 0
    public int getCol() {
        return col;
    }

    // getter available in the skeleton -> 0
    public int getRow() {
        return row;
    }
}
