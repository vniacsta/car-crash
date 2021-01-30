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
        col++;
    }

    public void moveLeft() {
        col--;
    }

    public void moveDown() {
        row++;
    }

    public void moveUp() {
        row--;
    }

    public void move() {

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

    // check if the car is in the field edges
    public boolean isEdge() {
        return col == Field.getWidth() - 1 || col == 0 || row == Field.getHeight() - 1 ||
                row == 0;
    }

    // change direction if car is on edge
    public void changeDirection() {

        if (col == Field.getWidth() - 1) {
            moveLeft();
        }

        if (col == 0) {
            moveRight();
        }

        if (row == Field.getHeight() - 1) {
            moveUp();
        }

        if (row == 0) {
            moveDown();
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
