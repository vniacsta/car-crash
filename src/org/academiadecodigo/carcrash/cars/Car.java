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

    // call the method to update the position of each car
    public void moveCar() {
        pos.moveWithinLimit();
    }

    // method to change crashed to true
    public void crashed() {
        this.crashed = true;
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
