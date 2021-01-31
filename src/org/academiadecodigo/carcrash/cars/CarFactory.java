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
                return new SmartCar(1, 'S');
            case 1:
                return new TeslaCar(3, 'T');
            default:
                return new GiuliettaCar(2, 'G');
        }
    }
}
