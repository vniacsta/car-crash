package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

// utility class to make car instances
public class CarFactory {

    // available in the skeleton as null
    // method to be called by game
    public static Car getNewCar() {

        // create my car instance
        return new SmartCar();
    }
}
