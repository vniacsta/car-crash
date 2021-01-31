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
    public void moveRight(int speed) {
        if (col + speed < Field.getWidth()) {
            col += speed;
        } else {
            col = Field.getWidth() - 1;
        }
    }

    public void moveLeft(int speed) {
        if (col - speed > 0) {
            col -= speed;
        } else {
            col = 0;
        }
    }

    public void moveDown(int speed) {
        if (row + speed < Field.getHeight()) {
            row += speed;
        } else {
            row = Field.getHeight() - 1;
        }
    }

    public void moveUp(int speed) {
        if (row - speed > 0) {
            row -= speed;
        } else {
            row = 0;
        }
    }

    public void move(int speed) {

        // cars will move in random directions
        int randomDirections = (int) (Math.random() * 4);
        // assign directions to random
        switch (randomDirections) {
            case 0:
                moveRight(speed);
                break;
            case 1:
                moveLeft(speed);
                break;
            case 2:
                moveDown(speed);
                break;
            default:
                moveUp(speed);
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
            col--; // move left
        }

        if (col == 0) {
            col++; // move right
        }

        if (row == Field.getHeight() - 1) {
            row--; // move up
        }

        if (row == 0) {
            row++; // move down
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
