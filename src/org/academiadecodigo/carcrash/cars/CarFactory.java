package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

// utility class to make car instances
public class CarFactory {

    // available in the skeleton as null
    // method to be called by game
    public static Car getNewCar() {

        int randomCar = (int) (Math.random() * 3);

        switch (randomCar) {
            case 0:
                return new SmartCar();
            case 1:
                return new TeslaCar();
            default:
                return new GiuliettaCar();
        }
    }
}
