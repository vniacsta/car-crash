package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    // available in the skeleton
    /* The position of the car on the grid */
    private Position pos;

    // creating a constructor for the car's position in order to get a position in the field
    public Car() {
        pos = new Position();
    }

    // creating a method to move cars
    public void moveCar() {

    }

    // getter available in the skeleton
    public Position getPos() {
        return pos;
    }

    // getter available in the skeleton
    public boolean isCrashed() {
        return false;
    }
}
