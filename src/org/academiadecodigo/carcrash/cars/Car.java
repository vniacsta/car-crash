package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    // available in the skeleton
    /* The position of the car on the grid */
    private Position pos;
    private boolean crashed;

    // creating a constructor for the car's position in order to get a position in the field
    public Car() {
        pos = new Position();
        crashed = false;
    }

    // method to change crashed to true
    public void crashed() {
        this.crashed = true;
    }

    // method to update the position of each car - called in game
    public void moveCar() {

        // crashed cars can not move
        if (isCrashed()) {
            return;
        }

        // change direction if cars bump against the wall
        if (pos.isEdge()) {
            pos.changeDirection();
        }

        pos.move();
    }

    // getter available in the skeleton
    public Position getPos() {
        return pos;
    }

    // getter available in the skeleton -> false
    public boolean isCrashed() {
        return crashed;
    }
}
