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

    // method to move cars
    public void updatePosition() {

        // cars will move in random directions
        int randomSides = (int) (Math.random() * 4);

        switch (randomSides) {
            // move it to the right
            case 0:
                row++;
                break;
            // move it to the left
            case 1:
                row--;
                break;
            // move it down
            case 2:
                col++;
                break;
            // move it up
            default:
                col--;
                break;
        }
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
